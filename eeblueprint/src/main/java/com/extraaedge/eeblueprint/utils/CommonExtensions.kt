package com.extraaedge.eeblueprint.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.provider.Settings
import android.view.View
import android.widget.EditText
import androidx.annotation.DrawableRes
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import de.mateware.snacky.Snacky
import java.util.*


/**
 * An extension function to check active network connections
 * @receiver Context
 * @return Boolean
 */
//region: Context Extension

fun Context.hasPermissions(permissions: Array<String>): Boolean {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        for (permission in permissions) {
            if (ActivityCompat.checkSelfPermission(
                    this,
                    permission
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                return false
            }
        }
    }
    return true
}

fun Activity.handleOverlayPermission(requestCode: Int) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        if (!Settings.canDrawOverlays(this)) {
            val intent = Intent(
                Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                Uri.parse("package:$packageName")
            )
            startActivityForResult(intent, requestCode)
        }
    }
}

fun Context.getManifestPermissions(): Array<String> {
    var packageInfo: PackageInfo? = null
    val list = ArrayList<String>(1)
    try {
        packageInfo = packageManager.getPackageInfo(
            packageName,
            PackageManager.GET_PERMISSIONS
        )
    } catch (e: PackageManager.NameNotFoundException) {
        e.message?.let { error(it) }
    }

    if (packageInfo != null) {
        val permissions = packageInfo.requestedPermissions
        if (permissions != null) {
            Collections.addAll(list, *permissions)
        }
    }
    return list.toTypedArray()
}

fun View.snackBarSuccess(message: String) {
    return Snacky.builder()
        .setView(this)
        .setText(message)
        .setDuration(Snacky.LENGTH_LONG)
        .success()
        .show()
}


fun View.snackBarError(message: String) {
    return Snacky.builder()
        .setText(message)
        .setView(this)
        .setDuration(Snacky.LENGTH_LONG)
        .error()
        .show()
}

fun View.snackBarInfo(message: String) {
    return Snacky.builder()
        .setView(this)
        .setText(message)
        .setDuration(Snacky.LENGTH_LONG)
        .warning()
        .show()
}
//endregion

fun Context.getColorCompat(color: Int): Int {
    return ContextCompat.getColor(this, color)
}

fun Context.getDrawableCompat(@DrawableRes id: Int) = ContextCompat.getDrawable(this, id)

/**
 * An Extension function that separates the items of array list into a new line
 *
 * @receiver ArrayList<String>
 * @return String
 */
fun ArrayList<String>.toLineSeparatedString(): String {
    val sb = StringBuilder("")
    this.forEach {
        sb.append("$it \n")
    }
    return sb.toString()
}

/**
 * An Extension function that separate the items of array list by comma
 *
 * @receiver ArrayList<String>
 * @return String
 */
fun ArrayList<String>.toCommaSeparatedString(): String {
    val sb = StringBuilder("")
    this.forEach {
        sb.append("$it, ")
    }
    sb.deleteCharAt(sb.length - 2)
    return sb.toString()
}

fun String.isEmail(): Boolean {
    val p = "^(\\w)+(\\.\\w+)*@(\\w)+((\\.\\w+)+)\$".toRegex()
    return matches(p)
}

fun String.isNumeric(): Boolean {
    val p = "^[0-9]+$".toRegex()
    return matches(p)
}

fun String.isOnlyIndianPhone(): Boolean {
    val p = "^[6-9]\\d{9}\$".toRegex()
    return matches(p)
}
//endregion


val EditText.value get() = text.toString()


fun <T : Any> T.TAG() = this::class.java.simpleName


fun String.ellipsize(at: Int): String {
    if (this.length > at) {
        return this.substring(0, at) + "..."
    }
    return this
}

//region: Random

fun IntRange.random() =
    Random().nextInt((endInclusive + 1) - start) + start

fun Random.randomString(length: Int = 8): String {
    val base = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
    var randomString = ""

    for (i in 1..length) {
        val randomValue = (0 until base.length).random()
        randomString += "${base[randomValue]}"
    }
    return randomString
}
//endregion


