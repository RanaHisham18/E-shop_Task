package com.rana.e_shoptask.Ui

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rana.e_shoptask.R
import kotlin.reflect.KFunction1

class ProductAdapter: RecyclerView.Adapter<ProductAdapter.MyViewHolder>() {


    private var productlist: List<ProductModel>?= null
    fun setProductList (productlist : List<ProductModel>?) {

        this.productlist = productlist
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
    : ProductAdapter.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.shopping_item, parent,false)

        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductAdapter.MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        if (productlist == null) return 0
        else return productlist?.size!!
    }
    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view){

      val Image = view.productImage
    }

    fun bind(data: ProductModel){
        //pass the model items into the vie
        
    }
}



