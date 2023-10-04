package com.extraaedge.eeblueprint.utils

import android.app.Activity
import android.content.Context
import android.graphics.Typeface
import android.text.TextUtils
import com.extraaedge.eeblueprint.R
import com.extraaedge.eeblueprint.remote.EEError
import com.extraaedge.eeblueprint.utils.DateTimeFormat.TIME_ZONE_UTC
import com.google.android.material.snackbar.Snackbar
import de.mateware.snacky.Snacky
import okhttp3.*
import retrofit2.HttpException
import java.net.ConnectException
import java.net.SocketTimeoutException
import java.net.UnknownHostException
import java.util.*

const val KEY_TOKEN = "ee_token"
const val KEY_REFRESH_TOKEN = "ee_refresh_token"
const val KEY_EXPIRES_IN = "ee_expires_in"
const val KEY_CREATED_ON = "ee_created_on"
const val KEY_CLIENT_ID = "ee_client_id"

const val HEADERS_IMPORT = "headers_import"
const val LOGGING_IMPORT = "logging_import"
const val OKLOG_IMPORT = "oklog_import"

const val CONNECT_TIMEOUT_SECONDS : Long = 25
const val READ_TIMEOUT_SECONDS : Long = 45
const val WRITE_TIMEOUT_SECONDS : Long = 40

object DateTimeFormat {
    const val ISO = "yyyy-MM-dd'T'HH:mm:ss"
    const val TIME_ZONE_UTC = "UTC"
    const val YYYY_MM_DD_T_HH_MM_SS = "yyyy-MM-dd'T'HH:mm:ss"
    const val DD_MM_YYYY_HH_MM_SS_A = "dd/MM/yyyy hh:mm:ss a"
    const val YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss.SSS"
    const val YMD = "yyyy-MM-dd"
    const val HH_MM_A = "hh:mm a"
    const val DD_MMM_YYYY = "dd MMM, yyyy"
}

fun saveAuthToken(context: Context, token: String) {
    EEPreferences(context).saveString(KEY_TOKEN, token)
}

fun saveSession(context: Context, eeSession: EESession) {
    EEPreferences(context).saveString(KEY_TOKEN, eeSession.token)
    EEPreferences(context).saveString(KEY_REFRESH_TOKEN, eeSession.refreshToken)
    EEPreferences(context).saveLong(KEY_CREATED_ON, eeSession.createdOnMillis)
    EEPreferences(context).saveLong(KEY_EXPIRES_IN, eeSession.expiresIn)
    EEPreferences(context).saveString(KEY_CLIENT_ID, eeSession.clientId)
}

fun getSession(context: Context): EESession {
    return with(EEPreferences(context)) {
        EESession(
            token = getString(KEY_TOKEN) ?: "",
            refreshToken = getString(KEY_REFRESH_TOKEN) ?: "",
            expiresIn = getLong(KEY_EXPIRES_IN),
            createdOnMillis = getLong(KEY_CREATED_ON),
            clientId = getString(KEY_CLIENT_ID) ?: ""
        )
    }
}

fun isAuthTokenValid(context: Context): Boolean {
    val session = getSession(context)
    val expiresInMillis = session.expiresIn * 1000
    return (session.createdOnMillis + expiresInMillis
            >= System.currentTimeMillis())
}

fun getAuthToken(context: Context): String? {
    return EEPreferences(context).getString(KEY_TOKEN)
}


fun Throwable.getEEError(): EEError {

    if (this is HttpException) {
        val httpException = this

        val errorBody = httpException.response()?.errorBody()?.string()

        if (TextUtils.isEmpty(errorBody)) {
            return when (this.code()) {
                NETWORK_CODE_401 -> EEError(
                    EEErrorCodes.INVALID_SESSION,
                    EEErrorCodes.INVALID_SESSION.errorMessageFromCode()
                )

                NETWORK_CODE_404 -> EEError(
                    EEErrorCodes.RESOURCE_NOT_FOUND,
                    EEErrorCodes.RESOURCE_NOT_FOUND.errorMessageFromCode()
                )

                NETWORK_CODE_400 -> EEError(
                    EEErrorCodes.BAD_REQUEST,
                    EEErrorCodes.BAD_REQUEST.errorMessageFromCode()
                )

                NETWORK_CODE_500 -> EEError(
                    EEErrorCodes.SERVER_ERROR,
                    EEErrorCodes.SERVER_ERROR.errorMessageFromCode()
                )

                NETWORK_CODE_502 -> EEError(
                    EEErrorCodes.SERVER_ERROR,
                    EEErrorCodes.SERVER_ERROR.errorMessageFromCode()
                )
                else -> EEError(
                    EEErrorCodes.GENERIC_ERROR,
                    EEErrorCodes.GENERIC_ERROR.errorMessageFromCode()
                )

            }
        } else {
            return EEError(
                EEErrorCodes.GENERIC_ERROR,
                EEErrorCodes.GENERIC_ERROR.errorMessageFromCode()
            )

        }
    }

    if (this is ConnectException || this is SocketTimeoutException || this is UnknownHostException) {
        return EEError(
            EEErrorCodes.NO_INTERNET,
            EEErrorCodes.NO_INTERNET.errorMessageFromCode()
        )
    }
    return EEError(
        EEErrorCodes.GENERIC_ERROR,
        EEErrorCodes.GENERIC_ERROR.errorMessageFromCode()
    )
}

fun snackBarSuccess(context: Context, message: String, onDismiss: (() -> Unit)? = null) {
    if (context is Activity) {
        val snackBar = Snacky.builder()
            .setActivity(context)
            .setText(message)
            .setDuration(Snacky.LENGTH_SHORT)
            .success()

        if (onDismiss != null) {
            snackBar.addCallback(object : Snackbar.Callback() {
                override fun onDismissed(transientBottomBar: Snackbar?, event: Int) {
                    onDismiss()
                }
            })
        }

        snackBar.show()
    }
}


fun snackBarError(context: Context, message: String, onDismiss: (() -> Unit)? = null) {
    if (context is Activity) {
        val snackBar = Snacky.builder()
            .setText(message)
            .setActivity(context)
            .setDuration(Snacky.LENGTH_LONG)
            .error()

        if (onDismiss != null) {
            snackBar.addCallback(object : Snackbar.Callback() {
                override fun onDismissed(transientBottomBar: Snackbar?, event: Int) {
                    onDismiss()
                }
            })
        }

        snackBar.show()
    }
}

fun snackBarInfo(context: Context, message: String, onDismiss: (() -> Unit)? = null) {
    if (context is Activity) {
        val snackBar = Snacky.builder()
            .setActivity(context)
            .setText(message)
            .setDuration(Snacky.LENGTH_LONG)
            .warning()

        if (onDismiss != null) {
            snackBar.addCallback(object : Snackbar.Callback() {
                override fun onDismissed(transientBottomBar: Snackbar?, event: Int) {
                    onDismiss()
                }
            })
        }

        snackBar.show()
    }
}

fun customSnackBar(
    context: Context,
    backgroundColor: Int,
    textColor: Int,
    message: String,
    actionText: String,
    actionTextColor: Int,
    icon: Int
) {
    return Snacky.builder()
        .setBackgroundColor(backgroundColor)
        .setText(message)
        .setTextColor(textColor)
        .setActionText(actionText)
        .setActionTextColor(actionTextColor)
        .setIcon(icon)
        .setActivity(context as Activity)
        .setTextSize(14F)
        .setActionTextSize(18F)
        .setMaxLines(4)
        .centerText()
        .setActionTextTypefaceStyle(Typeface.BOLD)
        .setTextTypefaceStyle(Typeface.NORMAL)
        .setDuration(Snacky.LENGTH_INDEFINITE)
        .build()
        .show()
}

fun currentTimeInISO(): String {
    return Calendar.getInstance()
        .getFormattedDateWithZone(DateTimeFormat.ISO, TIME_ZONE_UTC)
}


fun createTimeoutErrorResponse(context: Context,request: Request): Response {
    val responseBody = ResponseBody.create(MediaType.parse("text/plain"), "error here",)
    val response =  Response.Builder()
        .request(request)
        .protocol(Protocol.HTTP_1_1)
        .body(responseBody)
        .code(108)
        .message(context.getString(R.string.request_time_out))
        .build()

    return response
}

// Function to create a custom error response for generic errors
fun createGenericErrorResponse(context: Context,request: Request): Response {
    val responseBody = ResponseBody.create(MediaType.parse("text/plain"), "")

    val response = Response.Builder()
        .request(request)
        .protocol(Protocol.HTTP_1_1)
        .body(responseBody)
        .code(109)
        .message(context.getString(R.string.an_error_occurred))
        .build()

    return response
}
