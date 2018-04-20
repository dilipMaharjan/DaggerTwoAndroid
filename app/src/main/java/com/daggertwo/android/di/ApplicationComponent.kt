package com.daggertwo.android.di

import android.app.Application
import com.daggertwo.android.MainActivity
import com.daggertwo.android.di.modules.ActivityBindingModule
import com.daggertwo.android.di.modules.AndroidModule
import com.daggertwo.android.login.di.modules.LoginActivityModule
import com.daggertwo.android.login.di.modules.LoginModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication
import javax.inject.Singleton


/**
 * Created by Dilip Maharjan on 04/11/2018
 */
@Singleton
@Component(modules = [AndroidModule::class, ActivityBindingModule::class, LoginActivityModule::class, AndroidSupportInjectionModule::class])

interface ApplicationComponent : AndroidInjector<DaggerApplication> {
    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): ApplicationComponent
    }
}