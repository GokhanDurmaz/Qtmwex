package com.qtmwex.demo.di.components

import com.qtmwex.demo.App
import com.qtmwex.demo.di.modules.ActivityInjectionModule
import com.qtmwex.demo.di.modules.AppModule
import com.qtmwex.demo.di.modules.FragmentInjectionModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

/**
 * Created by gokhan on 12/23/20.
 */
@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        ActivityInjectionModule::class,
        FragmentInjectionModule::class
    ]
)
interface AppComponent : AndroidInjector<App> {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: App): AppComponent
    }
}
