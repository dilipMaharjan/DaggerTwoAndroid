package com.daggertwo.android

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.daggertwo.android.common.di.component
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        component.inject(this)
    }
}