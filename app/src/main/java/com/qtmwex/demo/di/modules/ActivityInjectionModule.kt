package com.qtmwex.demo.di.modules

import com.qtmwex.demo.ui.activity.MainActivity
<<<<<<< HEAD
=======
import com.qtmwex.demo.ui.activity.SplashActivity
>>>>>>> uı-dev
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by gokhan on 12/23/20.
 */
@Module
abstract class ActivityInjectionModule {

    @ContributesAndroidInjector
    abstract fun mainActivityInjector(): MainActivity
<<<<<<< HEAD
=======

    @ContributesAndroidInjector
    abstract fun splashActivityInjector(): SplashActivity
>>>>>>> uı-dev
}
