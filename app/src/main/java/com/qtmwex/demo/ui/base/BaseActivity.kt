package com.qtmwex.demo.ui.base

import android.os.Bundle
import dagger.android.DaggerActivity
import androidx.viewbinding.ViewBinding
import dagger.android.support.DaggerAppCompatActivity

/**
 * Created by gokhan on 12/13/20.
 */

abstract class BaseActivity<VB: ViewBinding> : DaggerAppCompatActivity() {

    lateinit var activityBinding: VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityBinding = getActivityViewBinding()
        setContentView(activityBinding.root)
    }

    abstract fun getActivityViewBinding(): VB
}
