package com.qtmwex.demo.ui.fragment

import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import com.qtmwex.demo.databinding.FragmentMainBinding
import com.qtmwex.demo.ui.base.BaseFragment

/**
 * Created by gokhan on 12/23/20.
 */

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
    }
}
