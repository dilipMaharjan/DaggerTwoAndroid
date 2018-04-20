package com.daggertwo.android.di.modules

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module


/**
 * Created by Dilip Maharjan on 04/11/2018
 */
@Module
abstract class AndroidModule {
    @Binds
    internal abstract fun bindContext(application: Application): Context
}