package com.example.androidmvvmkotlin.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.androidmvvmkotlin.data.Quote
import com.example.androidmvvmkotlin.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuotes(quote: Quote) = quoteRepository.addQuote(quote)

}