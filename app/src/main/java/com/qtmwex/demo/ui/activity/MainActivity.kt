package com.qtmwex.demo.ui.activity

import android.os.Bundle
import com.qtmwex.demo.databinding.ActivityMainBinding
import com.qtmwex.demo.ui.base.BaseActivity

/**
 * Created by gokhan on 12/13/20.
 */

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun getActivityViewBinding() = ActivityMainBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
