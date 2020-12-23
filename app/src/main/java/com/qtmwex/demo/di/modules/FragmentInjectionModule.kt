package com.qtmwex.demo.di.modules

import com.qtmwex.demo.ui.fragment.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by gokhan on 12/23/20.
 */
@Module
abstract class FragmentInjectionModule {

    @ContributesAndroidInjector
    abstract fun mainFragmentInjector(): MainFragment
}
