package com.guyi.class25b_and_6

import android.app.Application

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        Imager.initHelper(this)
    }
}