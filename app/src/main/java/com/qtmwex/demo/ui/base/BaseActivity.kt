package com.qtmwex.demo.ui.base

import android.os.Bundle
<<<<<<< HEAD
import android.os.PersistableBundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import dagger.android.DaggerActivity
=======
import androidx.viewbinding.ViewBinding
import dagger.android.support.DaggerAppCompatActivity
>>>>>>> uı-dev

/**
 * Created by gokhan on 12/13/20.
 */

<<<<<<< HEAD
abstract class BaseActivity: DaggerActivity() {
=======
abstract class BaseActivity<VB: ViewBinding> : DaggerAppCompatActivity() {
>>>>>>> uı-dev

    lateinit var activityBinding: VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityBinding = getActivityViewBinding()
        setContentView(activityBinding.root)
    }

    abstract fun getActivityViewBinding(): VB
}
