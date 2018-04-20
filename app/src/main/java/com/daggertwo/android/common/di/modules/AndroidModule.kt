package com.daggertwo.android.common.di.modules

import android.app.Application
import android.content.Context
import android.daggertwo.com.data.models.User
import dagger.Module
import dagger.Provides


/**
 * Created by Dilip Maharjan on 04/11/2018
 */

@Module
class AndroidModule(private val application: Application) {

    @Provides
    fun provideApplicationContext(): Context = application

    @Provides
    fun providesUser() = User("username", "password")
}