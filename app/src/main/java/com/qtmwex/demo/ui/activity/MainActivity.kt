package com.qtmwex.demo.ui.activity

import android.os.Bundle
import android.os.PersistableBundle
import com.qtmwex.demo.R
import com.qtmwex.demo.ui.base.BaseActivity

/**
 * Created by gokhan on 12/13/20.
 */

class MainActivity : BaseActivity() {

    override fun layoutRes(): Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }
}
