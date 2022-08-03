package com.rana.e_shoptask.data.remote.Retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ProductRetrofitInstance {
    companion object {
        val BASE_URL = "https://dummyjson.com/products"


    fun getProdRetroInstance() : Retrofit{
     return Retrofit.Builder()
    .baseUrl(BASE_URL)
    .addConverterFactory(GsonConverterFactory.create())
    .build()

    } }
}