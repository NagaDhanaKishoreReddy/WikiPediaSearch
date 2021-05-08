package com.crp.wikisearcher

import android.app.Application
import com.crp.wikisearcher.di.networkModule
import com.crp.wikisearcher.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App :Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(listOf(networkModule,viewModelModule))
        }

    }
}