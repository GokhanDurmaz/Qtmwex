package com.qtmwex.demo.ui.activity

import android.content.Intent
import android.os.Bundle
import com.qtmwex.demo.databinding.ActivitySplashBinding
import com.qtmwex.demo.ui.base.BaseActivity

/**
 * Created by gokhan on 12/24/20.
 */

class SplashActivity : BaseActivity<ActivitySplashBinding>() {

    override fun getActivityViewBinding() = ActivitySplashBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setView()
    }

    private fun setView() {
        activityBinding.btnMainActivity.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
