package com.idea3d.examplemvvm.domain

import com.idea3d.examplemvvm.data.data.Model.QuoteModel
import com.idea3d.examplemvvm.data.data.Model.QuoteProvider

class GetRandomQuoteUseCase {
    operator fun invoke(): QuoteModel?{
        val quotes = QuoteProvider.quotes
        if(!quotes.isNullOrEmpty()){
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}