package com.extraaedge.eeblueprint.utils

import android.content.Context
import android.net.ConnectivityManager
import android.telephony.TelephonyManager

@Suppress("UNCHECKED_CAST")
fun <T> Context.getSystemServiceAs(serviceName: String): T =
    this.getSystemService(serviceName) as T

fun Context.getConnectivityManager(): ConnectivityManager =
    getSystemServiceAs(Context.CONNECTIVITY_SERVICE)

fun Context.getTelephonyManager(): TelephonyManager =
    getSystemServiceAs(Context.TELEPHONY_SERVICE)

enum class NetworkType {
    WIFI, MOBILE, OTHER, NONE
}

fun Context.networkTypeName(): String {
    var result = "(No Network)"
    try {
        val cm = this.getConnectivityManager()
        val info = cm.activeNetworkInfo
        if (info == null || !info.isConnectedOrConnecting) {
            return result
        }
        result = info.typeName
        if (info.type == ConnectivityManager.TYPE_MOBILE) {
            result += info.subtypeName
        }
    } catch (ignored: Throwable) {
    }
    return result
}

fun Context.networkOperator(): String {
    val tm = this.getTelephonyManager()
    return tm.networkOperator
}

fun Context.networkType(): NetworkType {
    val cm = this.getConnectivityManager()
    val info = cm.activeNetworkInfo
    if (info == null || !info.isConnectedOrConnecting) {
        return NetworkType.NONE
    }
    return when (info.type) {
        ConnectivityManager.TYPE_WIFI -> NetworkType.WIFI
        ConnectivityManager.TYPE_MOBILE -> NetworkType.MOBILE
        else -> NetworkType.OTHER
    }
}

fun Context.isWifi(): Boolean {
    return networkType() == NetworkType.WIFI
}

fun Context.isMobile(): Boolean {
    return networkType() == NetworkType.MOBILE
}

fun Context.isConnected(): Boolean {
    val cm = this.getConnectivityManager()
    val info = cm.activeNetworkInfo
    return info != null && info.isConnectedOrConnecting
}