package com.daggertwo.android.common.di.modules

import com.daggertwo.android.data.User
import dagger.Module
import dagger.Provides


/**
 * Created by Dilip Maharjan on 04/12/2018
 */
@Module
class DataModule(private val user: User) {

    @Provides
    fun provideUser(): User = user
}