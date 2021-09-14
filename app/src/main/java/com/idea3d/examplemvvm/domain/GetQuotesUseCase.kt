package com.idea3d.examplemvvm.domain

import com.idea3d.examplemvvm.data.data.Model.QuoteModel
import com.idea3d.examplemvvm.data.data.QuoteRepository

class GetQuotesUseCase {
    private val repository = QuoteRepository()
    suspend operator fun invoke():List<QuoteModel>? = repository.getAllQuotes()
}