package com.daggertwo.android

import android.content.Context
import android.daggertwo.com.data.models.User
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.daggertwo.android.common.di.component
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var context: Context
    @Inject
    lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Context: $context")
        println("User $user")
    }
}