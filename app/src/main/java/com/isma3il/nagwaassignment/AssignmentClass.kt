package com.isma3il.nagwaassignment

import android.app.Application
import com.isma3il.nagwaassignment.di.ApplicationComponent
import com.isma3il.nagwaassignment.di.DaggerApplicationComponent

class AssignmentClass:Application() {

    val applicationComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent.factory().create(applicationContext)
    }

    override fun onCreate() {
        super.onCreate()

    }
}