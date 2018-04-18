package com.daggertwo.android.login.di.modules

import android.daggertwo.com.data.models.User
import dagger.Module
import dagger.Provides


/**
 * Created by Dilip Maharjan on 04/18/2018
 */
@Module
class LoginModule {
    @Provides
    fun providesUser() = User("dilip", "password")
}