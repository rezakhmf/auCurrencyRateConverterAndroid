package com.reza.aucurrencyrateconverterandroid.di

import android.content.Context
import com.reza.aucurrencyrateconverterandroid.AuCurrencyRateConverterApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = arrayOf(MainActivityBuilder::class))
class AuCurrencyRateConverterAppModule {

    @Provides
    @Singleton
    fun provideContext(app: AuCurrencyRateConverterApp): Context {
        return app.applicationContext
    }
}