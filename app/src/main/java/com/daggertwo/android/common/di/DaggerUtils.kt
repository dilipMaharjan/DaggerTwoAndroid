package com.daggertwo.android.common.di

import android.support.v7.app.AppCompatActivity
import com.daggertwo.android.Application


/**
 * Created by Dilip Maharjan on 04/11/2018
 */

val AppCompatActivity.component: ApplicationComponent
    get() = (application as Application).component