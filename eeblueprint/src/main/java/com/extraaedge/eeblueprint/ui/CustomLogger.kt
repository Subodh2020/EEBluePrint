package com.extraaedge.eeblueprint.ui

import com.github.simonpercic.oklog.core.Logger
import com.hypertrack.hyperlog.HyperLog

class CustomLogger : Logger {

    override fun w(tag: String?, message: String?) {
        HyperLog.w(tag,message)
    }

    override fun e(tag: String?, message: String?, throwable: Throwable?) {
        HyperLog.e(tag,message)
    }

    override fun d(tag: String?, message: String?) {
        HyperLog.d(tag,message)
    }
}