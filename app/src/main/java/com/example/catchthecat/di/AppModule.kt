package com.example.catchthecat.di

import com.example.catchthecat.ui.imagefeed.ImageFeedViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { ImageFeedViewModel() }
}