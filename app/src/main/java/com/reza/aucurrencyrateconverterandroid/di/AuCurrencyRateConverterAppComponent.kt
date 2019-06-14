package com.reza.aucurrencyrateconverterandroid.di

import com.reza.aucurrencyrateconverterandroid.AuCurrencyRateConverterApp
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjection
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component( modules = [AndroidSupportInjectionModule::class, AuCurrencyRateConverterAppModule::class])
interface AuCurrencyRateConverterAppComponent: AndroidInjector<AuCurrencyRateConverterApp> {

    @Component.Factory
    abstract class Factory: AndroidInjector.Factory<AuCurrencyRateConverterApp>
}
