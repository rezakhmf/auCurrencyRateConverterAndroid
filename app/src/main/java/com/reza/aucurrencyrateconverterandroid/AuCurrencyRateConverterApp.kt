package com.reza.aucurrencyrateconverterandroid

import com.reza.aucurrencyrateconverterandroid.di.DaggerAuCurrencyRateConverterAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class AuCurrencyRateConverterApp: DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAuCurrencyRateConverterAppComponent.factory().create(this)
    }
}