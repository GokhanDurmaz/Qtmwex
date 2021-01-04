package com.qtmwex.demo.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.viewbinding.ViewBinding
import com.qtmwex.demo.databinding.FragmentMainBinding
import dagger.android.support.DaggerFragment

/**
 * Created by gokhan on 12/23/20.
 */

abstract class BaseFragment<VB: ViewBinding> : DaggerFragment() {

    lateinit var fragmentBinding: VB

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentBinding = getFragmentViewBinding()
        return fragmentBinding.root
    }

    abstract fun getFragmentViewBinding(): VB
}
