package com.daggertwo.android.di.modules

import com.daggertwo.android.MainActivity
import com.daggertwo.android.di.scopes.PerActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


/**
 * Created by Dilip Maharjan on 04/18/2018
 */
@Module
abstract class ActivityBindingModule {
    @PerActivity
    @ContributesAndroidInjector(modules = [AndroidModule::class])
    internal abstract fun mainActivity(): MainActivity
}