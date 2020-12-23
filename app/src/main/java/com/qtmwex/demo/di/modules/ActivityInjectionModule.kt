package com.qtmwex.demo.di.modules

import com.qtmwex.demo.ui.activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by gokhan on 12/23/20.
 */
@Module
abstract class ActivityInjectionModule {

    @ContributesAndroidInjector
    abstract fun mainActivityInjector(): MainActivity
}

