package com.rana.e_shoptask.Ui

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rana.e_shoptask.R
import kotlin.reflect.KFunction1

class ProductAdapter(shoppingList: ShoppingList) : RecyclerView.Adapter<ProductAdapter.MyViewHolder>() {


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

        val itemsViewModel = productlist?.get(position)
        if (itemsViewModel != null) {
            holder.textView.text = itemsViewModel.title
            holder.textView.text = itemsViewModel.description
            holder.textView.text = itemsViewModel.price
        }
    }

    override fun getItemCount(): Int {
        if (productlist == null) return 0
        else return productlist?.size!!
    }
    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view){

//        val imageView: ImageView = itemView.findViewById(R.id.productImage)
        val textView: TextView = itemView.findViewById(R.id.productTitleTv)
        val textViewdesc: TextView = itemView.findViewById(R.id.productdescTv)
        val textViewprice: TextView = itemView.findViewById(R.id.productpriceTv)

        fun bindTo(productlist: List<ProductModel>?, activity: MainActivity){

}
    }

}



