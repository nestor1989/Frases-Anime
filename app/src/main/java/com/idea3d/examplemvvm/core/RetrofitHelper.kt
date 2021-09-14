package com.idea3d.examplemvvm.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://frases-anime-default-rtdb.firebaseio.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}