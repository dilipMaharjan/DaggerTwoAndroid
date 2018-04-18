package com.daggertwo.android.login.di.modules

import com.daggertwo.android.login.LoginActivity
import dagger.Subcomponent


/**
 * Created by Dilip Maharjan on 04/18/2018
 */
@Subcomponent(modules = [LoginModule::class])
interface LoginComponent {
    fun inject(loginActivity: LoginActivity)
}