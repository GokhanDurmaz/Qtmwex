package com.qtmwex.demo.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
<<<<<<< HEAD
import androidx.fragment.app.Fragment
=======
import androidx.viewbinding.ViewBinding
import com.qtmwex.demo.databinding.FragmentMainBinding
>>>>>>> uı-dev
import dagger.android.support.DaggerFragment

/**
 * Created by gokhan on 12/23/20.
 */

<<<<<<< HEAD
abstract class BaseFragment : DaggerFragment() {

    @LayoutRes
    abstract fun layoutRes(): Int
=======
abstract class BaseFragment<VB: ViewBinding> : DaggerFragment() {

    lateinit var fragmentBinding: VB
>>>>>>> uı-dev

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
<<<<<<< HEAD
    ): View? = inflater.inflate(layoutRes(), container, false)
}
=======
    ): View {
        fragmentBinding = getFragmentViewBinding()
        return fragmentBinding.root
    }

    abstract fun getFragmentViewBinding(): VB
}
>>>>>>> uı-dev
