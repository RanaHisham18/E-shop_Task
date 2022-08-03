package com.rana.e_shoptask.data.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rana.e_shoptask.Ui.ProductModel
import com.rana.e_shoptask.data.remote.Retrofit.ProductRetrofitInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import com.rana.e_shoptask.data.remote.Retrofit.IProductInstance as IProductInstance


class MainViewModel : ViewModel(){

    lateinit var liveDatalist: MutableLiveData<List<ProductModel>>

    init{
        liveDatalist = MutableLiveData()
    }

    fun getObserver(): MutableLiveData<List<ProductModel>>{
        return liveDatalist}

    fun callAPI(){
        val retrofitInstance = ProductRetrofitInstance.getProdRetroInstance()
        val retroservice = retrofitInstance.create(IProductInstance::class.java)
        val call = retroservice.fetchProducts()
        call.enqueue (object : Callback <List<ProductModel>>{
            override fun onResponse(
                call: Call<List<ProductModel>>,
                response: Response<List<ProductModel>>,
            ) {
            liveDatalist.postValue(response.body())
            }

            override fun onFailure(call: Call<List<ProductModel>>, t: Throwable) {
              liveDatalist.postValue(null)
            }
        })




} }


