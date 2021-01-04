package com.qtmwex.demo.ui.fragment

import android.os.Bundle
<<<<<<< HEAD
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.qtmwex.demo.R
=======
import android.view.View
import android.widget.SeekBar
import com.qtmwex.demo.databinding.FragmentMainBinding
>>>>>>> uı-dev
import com.qtmwex.demo.ui.base.BaseFragment

/**
 * Created by gokhan on 12/23/20.
 */

<<<<<<< HEAD
class MainFragment : BaseFragment() {
    override fun layoutRes(): Int = R.layout.fragment_main

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
=======
class MainFragment : BaseFragment<FragmentMainBinding>() {

    override fun getFragmentViewBinding() = FragmentMainBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setView()
    }

    private fun setView() {
        fragmentBinding.fabPlay.setOnClickListener {
            // TODO() Impl. action of the play button
        }
        fragmentBinding.fabPause.setOnClickListener {
            // TODO() Impl. action of the pause button
        }
        fragmentBinding.fabStop.setOnClickListener {
            // TODO() Impl. action of the stop button
        }
        fragmentBinding.sbSlider.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                // TODO() Impl. action of the SeekBar onProgressChanged event
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                // TODO() Impl. action of the SeekBar onStartTrackingTouch event
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                // TODO() Impl. action of the SeekBar onStopTrackingTouch event
            }
        })
>>>>>>> uı-dev
    }
}
