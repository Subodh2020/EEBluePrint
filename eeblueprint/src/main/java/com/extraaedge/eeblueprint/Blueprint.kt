package com.extraaedge.eeblueprint

import android.content.Context

object Blueprint {

    private lateinit var appContext: Context

    fun setContext(context: Context) {
        appContext = context
    }

    fun getContext(): Context {
        return appContext
    }

}