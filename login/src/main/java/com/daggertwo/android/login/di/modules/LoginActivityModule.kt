package com.daggertwo.android.login.di.modules

import com.daggertwo.android.login.LoginActivity
import com.daggertwo.android.login.di.modules.scope.LoginScope
import dagger.Module
import dagger.android.ContributesAndroidInjector


/**
 * Created by Dilip Maharjan on 04/18/2018
 */
@Module
abstract class LoginActivityModule {
    @LoginScope
    @ContributesAndroidInjector(modules =[LoginModule::class])
    internal abstract fun loginActivity(): LoginActivity
}