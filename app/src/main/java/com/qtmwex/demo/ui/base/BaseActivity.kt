package com.qtmwex.demo.ui.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import dagger.android.support.DaggerAppCompatActivity

/**
 * Created by gokhan on 12/13/20.
 */

abstract class BaseActivity: DaggerAppCompatActivity() {

    @LayoutRes
    abstract fun layoutRes(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutRes())
    }
}
