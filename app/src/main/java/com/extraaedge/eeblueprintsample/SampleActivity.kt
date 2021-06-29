package com.extraaedge.eeblueprintsample

import android.app.Activity
import com.extraaedge.eeblueprint.ui.BlueprintActivity

class SampleActivity : BlueprintActivity() {


    override fun create() {

    }

    override fun layout(): Int = R.layout.activity_sample

    override fun getActivity(): Activity = this

    override fun toolbarPresent(): Boolean = true
}