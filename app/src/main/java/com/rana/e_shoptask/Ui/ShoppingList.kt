package com.rana.e_shoptask.Ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.rana.e_shoptask.R
import androidx.recyclerview.widget.RecyclerView

class ShoppingList: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.shopping_list)
initRecyclerView()
}

private fun initRecyclerView(){

    productsRecyclerView.layoutManager = LinearLayoutManager(this)


    }


}
