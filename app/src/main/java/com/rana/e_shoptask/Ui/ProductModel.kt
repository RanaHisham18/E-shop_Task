package com.rana.e_shoptask.Ui


sealed class State {
    object Loading : State()
    data class Error(val errorMessage: String) : State()
    data class Success(val jobsList: List<Product>) : State()
}
//Data Model that contains Json object's item to be displayed
data class Product(
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
