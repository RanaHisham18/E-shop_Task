package com.rana.e_shoptask.Ui


//Data Model that contains Json object's item to be displayed
data class ProductModel(
    val Id: String,
    val title: String,
    val description: String,
    val price: String,
    val discount : String?,
    val rating: String?,
    val stock: String?,
    val brand: String?,
    val category:String,
    val image: String)
