package com.qtmwex.demo.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import dagger.android.support.DaggerFragment

/**
 * Created by gokhan on 12/23/20.
 */

abstract class BaseFragment : DaggerFragment() {

    @LayoutRes
    abstract fun layoutRes(): Int

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(layoutRes(), container, false)
}