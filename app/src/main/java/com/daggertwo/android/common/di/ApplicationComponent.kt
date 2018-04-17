package com.daggertwo.android.common.di

import com.daggertwo.android.MainActivity
import com.daggertwo.android.common.di.modules.AndroidModule
import com.daggertwo.android.common.di.modules.DataModule
import com.daggertwo.android.data.User
import com.daggertwo.android.login.LoginActivity
import dagger.Component
import javax.inject.Singleton


/**
 * Created by Dilip Maharjan on 04/11/2018
 */
@Singleton
@Component(modules = [(AndroidModule::class), (DataModule::class)])

interface ApplicationComponent {
    fun inject(activity: MainActivity)
    fun inject(login:LoginActivity)
}