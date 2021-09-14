package com.idea3d.examplemvvm.data.data

import com.idea3d.examplemvvm.data.data.Model.QuoteModel
import com.idea3d.examplemvvm.data.data.Model.QuoteProvider
import com.idea3d.examplemvvm.data.data.network.QuoteService

class QuoteRepository {
    private val api = QuoteService()
    suspend fun getAllQuotes():List<QuoteModel>{
        val response = api.getQuotes()
        QuoteProvider.quotes= response
        return response
    }
}