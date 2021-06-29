package com.extraaedge.eeblueprint.ui

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import com.extraaedge.eeblueprint.R
import kotlinx.android.synthetic.main.dialog_loading.*

class BlueprintLoadingDialog(context: Context) : Dialog(context, R.style.Theme_AppCompat_Dialog) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_loading)
    }

    fun setMessage(message: String?) {
        txtLoading.text = message ?: context.getString(R.string.dialog_label_loading)
    }
}