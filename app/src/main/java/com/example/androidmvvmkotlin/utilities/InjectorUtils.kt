package com.example.androidmvvmkotlin.utilities

import com.example.androidmvvmkotlin.data.FakeDatabase
import com.example.androidmvvmkotlin.data.QuoteRepository
import com.example.androidmvvmkotlin.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory{
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }

}