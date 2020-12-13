package com.qtmwex.demo.ui.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by gokhan on 12/13/20.
 */

abstract class BaseActivity: AppCompatActivity() {

    @LayoutRes
    abstract fun layoutRes(): Int

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(layoutRes())
    }
}
