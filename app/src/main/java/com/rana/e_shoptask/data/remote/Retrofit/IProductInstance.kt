package com.rana.e_shoptask.data.remote.Retrofit

import retrofit2.Call
import com.rana.e_shoptask.Ui.ProductModel
import retrofit2.http.GET

interface IProductInstance{

    @GET("dummyjson.com/products")
   fun fetchProducts():  Call <List <ProductModel>>
}