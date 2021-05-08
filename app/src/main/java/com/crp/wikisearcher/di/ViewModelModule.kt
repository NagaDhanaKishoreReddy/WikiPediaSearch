package com.crp.wikisearcher.di

import com.crp.wikisearcher.viewmodel.ViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        ViewModel()
    }
}