package com.daggertwo.android.login.di.modules

import android.daggertwo.com.data.models.User
import com.daggertwo.android.login.di.modules.scope.LoginScope
import dagger.Module
import dagger.Provides


/**
 * Created by Dilip Maharjan on 04/18/2018
 */
@Module
class LoginModule {
    @LoginScope
    @Provides
    fun providesUser(): String {
        return "String"
    }
}