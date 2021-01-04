package com.qtmwex.demo

import com.qtmwex.demo.di.components.DaggerAppComponent
<<<<<<< HEAD
import dagger.android.AndroidInjector
=======
>>>>>>> uı-dev
import dagger.android.DaggerApplication

/**
 * Created by gokhan on 12/13/20.
 */

class App : DaggerApplication() {

    override fun applicationInjector() = DaggerAppComponent
        .factory()
        .create(this)
}
