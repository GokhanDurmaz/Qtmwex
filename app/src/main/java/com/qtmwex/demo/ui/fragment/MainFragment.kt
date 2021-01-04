package com.qtmwex.demo.ui.fragment

import android.os.Bundle
import android.view.View
import com.qtmwex.demo.databinding.FragmentMainBinding
import com.qtmwex.demo.ui.base.BaseFragment

/**
 * Created by gokhan on 12/23/20.
 */

class MainFragment : BaseFragment<FragmentMainBinding>() {

    override fun getFragmentViewBinding() = FragmentMainBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}
