package com.idea3d.examplemvvm.data.data.Model

import com.google.gson.annotations.SerializedName

data class QuoteModel(
    @SerializedName ("frase") val quote:String,  @SerializedName ("nombre") val author:String)
