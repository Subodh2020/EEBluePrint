package com.extraaedge.eeblueprint.ui

import android.util.Log
import com.github.simonpercic.oklog.core.Logger
//import com.hypertrack.hyperlog.HyperLog

class CustomLogger : Logger {

    override fun w(tag: String?, message: String?) {
        Log.d(tag,message?:"")
    }

    override fun e(tag: String?, message: String?, throwable: Throwable?) {
        Log.d(tag,message?:"")
    }

    override fun d(tag: String?, message: String?) {
        Log.d(tag,message?:"")
    }
}