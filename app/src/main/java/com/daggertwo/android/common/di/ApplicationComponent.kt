package com.daggertwo.android.common.di

import com.daggertwo.android.MainActivity
import com.daggertwo.android.common.di.modules.AndroidModule
import dagger.Component
import javax.inject.Singleton


/**
 * Created by Dilip Maharjan on 04/11/2018
 */
@Singleton
@Component(modules = [(AndroidModule::class)])

interface ApplicationComponent {
    fun inject(activity: MainActivity)
}