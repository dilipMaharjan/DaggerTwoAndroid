package com.daggertwo.android


/**
 * Created by Dilip Maharjan on 04/11/2018
 */
import android.app.Application
import com.daggertwo.android.common.di.ApplicationComponent
import com.daggertwo.android.common.di.DaggerApplicationComponent
import com.daggertwo.android.common.di.modules.AndroidModule
import com.daggertwo.android.common.di.modules.DataModule
import com.daggertwo.android.data.User

class Application : Application() {

    lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerApplicationComponent
                .builder()
                .androidModule(AndroidModule(this))
                .dataModule(DataModule(User()))
                .build()

    }
}