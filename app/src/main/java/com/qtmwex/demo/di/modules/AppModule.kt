package com.qtmwex.demo.di.modules

import com.qtmwex.demo.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by gokhan on 12/23/20.
 */
@Module
class AppModule {

    @Provides
    @Singleton
    fun provideApplication(app: App): App = app
}
