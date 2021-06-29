package com.extraaedge.eeblueprint.ui

import android.content.Context
import com.afollestad.materialdialogs.DialogCallback
import com.afollestad.materialdialogs.MaterialDialog
import com.extraaedge.eeblueprint.R


fun errorDialog(context: Context, message: String, callback: DialogCallback? = null) {
    MaterialDialog(context).show {
        title(R.string.dialog_title_error)
        message(text = message)
        positiveButton(R.string.dialog_action_okay, click = callback)
    }
}

fun infoDialog(context: Context, message: String, callback: DialogCallback? = null) {
    MaterialDialog(context).show {
        title(R.string.dialog_title_info)
        message(text = message)
        positiveButton(R.string.dialog_action_okay, click = callback)
    }
}

fun confirmationDialog(context: Context, message: String, positiveCallBack: DialogCallback) {
    MaterialDialog(context).show {
        title(R.string.dialog_title_confirmation)
        message(text = message)
        positiveButton(R.string.dialog_action_yes, click = positiveCallBack)
        negativeButton(R.string.dialog_action_no)
    }
}