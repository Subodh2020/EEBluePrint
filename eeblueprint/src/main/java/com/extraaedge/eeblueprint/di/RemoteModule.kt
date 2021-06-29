package com.extraaedge.eeblueprint.di

import android.annotation.SuppressLint
import android.content.Context
import android.text.TextUtils
import com.extraaedge.eeblueprint.utils.*
import com.extraaedge.eeblueprint.ui.CustomLogger
import com.extraaedge.eeblueprint.utils.OKLOG_IMPORT
import com.github.simonpercic.oklog3.OkLogInterceptor
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Protocol
import okhttp3.internal.Util
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.security.SecureRandom
import java.security.cert.CertificateException
import java.security.cert.X509Certificate
import java.util.concurrent.TimeUnit
import javax.net.ssl.SSLContext
import javax.net.ssl.SSLSocketFactory
import javax.net.ssl.TrustManager
import javax.net.ssl.X509TrustManager


fun createRemoteModule(baseUrl: String, context: Context, isDebug: Boolean, isBearer :Boolean = true) = module {

    factory<Interceptor>(named(LOGGING_IMPORT)) {
        val loggingInterceptor = HttpLoggingInterceptor()
        if (isDebug)
            loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        else
            loggingInterceptor.level = HttpLoggingInterceptor.Level.NONE
        return@factory loggingInterceptor
    }

    factory<Interceptor>(named(OKLOG_IMPORT)) {
        return@factory OkLogInterceptor.builder().shortenInfoUrl(true).setLogger(CustomLogger()).build()
    }


    factory(named(HEADERS_IMPORT)) {
        Interceptor { chain ->
            val originalRequest = chain.request()
            val requestBuilder = originalRequest.newBuilder()
                .header("Accept", "application/json")
                .header("x-ee-app-type", "Android-Leads-Client")
                .method(originalRequest.method(), originalRequest.body())
            val token = getAuthToken(context)
            if (token != null && !TextUtils.isEmpty(token)) {

                var tokenString = "Bearer $token"

                if(!isBearer){
                    tokenString = "$token"
                }
                requestBuilder.addHeader("Authorization", tokenString)
            }
            val request = requestBuilder.build()
            chain.proceed(request)
        }
    }

    factory {
        val okHttpClient = OkHttpClient.Builder()
            .connectTimeout(CONNECT_TIMEOUT_SECONDS, TimeUnit.SECONDS)
            .readTimeout(READ_TIMEOUT_SECONDS, TimeUnit.SECONDS)
            .writeTimeout(WRITE_TIMEOUT_SECONDS, TimeUnit.SECONDS)
            .addInterceptor(get(named(LOGGING_IMPORT)))
            .protocols(Util.immutableList(Protocol.HTTP_1_1))
            .pingInterval(30, TimeUnit.SECONDS)
            //.addInterceptor(get(named(OKLOG_IMPORT)))
            .addNetworkInterceptor(get(named(HEADERS_IMPORT)))

        if(!isBearer){
            val trustAllCerts: Array<TrustManager> = arrayOf(
                object : X509TrustManager {
                    @SuppressLint("TrustAllX509TrustManager")
                    @Throws(CertificateException::class)
                    override fun checkClientTrusted(
                        chain: Array<X509Certificate?>?,
                        authType: String?
                    ) {
                    }
                    @SuppressLint("TrustAllX509TrustManager")
                    @Throws(CertificateException::class)
                    override fun checkServerTrusted(
                        chain: Array<X509Certificate?>?,
                        authType: String?
                    ) {
                    }
                    override fun getAcceptedIssuers(): Array<X509Certificate> {
                        return arrayOf()
                    }
                }
            )
            // Install the all-trusting trust manager
            val sslContext: SSLContext = SSLContext.getInstance("SSL")
            sslContext.init(null, trustAllCerts, SecureRandom())
            // Create an ssl socket factory with our all-trusting manager
            val sslSocketFactory: SSLSocketFactory = sslContext.socketFactory
            okHttpClient.sslSocketFactory(sslSocketFactory, trustAllCerts[0] as X509TrustManager)
            okHttpClient.hostnameVerifier { _, _ -> true }
        }

        okHttpClient.build()
    }

    single {
        Retrofit.Builder()
            .client(get())
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}