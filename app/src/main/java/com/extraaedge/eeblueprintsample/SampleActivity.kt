package com.extraaedge.eeblueprintsample

import android.app.Activity
import android.util.Log
import com.extraaedge.eeblueprint.di.createRemoteModule
import com.extraaedge.eeblueprint.ui.BlueprintActivity
import com.extraaedge.eeblueprint.utils.getAPIKey1Value
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_sample.btnClick
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.Interceptor
import org.koin.android.ext.android.inject

class SampleActivity : BlueprintActivity() {

    override fun create() {
    }

    override fun layout(): Int = R.layout.activity_sample

    override fun getActivity(): Activity = this

    override fun toolbarPresent(): Boolean = true
}