package com.reza.aucurrencyrateconverterandroid.di

import com.reza.aucurrencyrateconverterandroid.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityBuilder {

    @ContributesAndroidInjector(modules = [])
    abstract fun bindingMainActivity(): MainActivity
}