package com.rana.e_shoptask.Ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.rana.e_shoptask.R
import com.rana.e_shoptask.data.viewmodel.MainViewModel

class ShoppingList : AppCompatActivity() {
    lateinit var recyclerAdapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.shopping_list)
        initRecyclerView()
    }

    private fun initRecyclerView() {

        val recyclerView = findViewById<RecyclerView>(R.id.productsRecyclerView)
        recyclerAdapter = ProductAdapter(this)
        recyclerView.adapter = recyclerAdapter


    }

    private fun initViewModel() {
        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.getObserver().observe(this, Observer {
            if (it != null) {
                recyclerAdapter.setProductList(it)
                recyclerAdapter.notifyDataSetChanged()
            } else {
                Toast.makeText(this, "Error in loading the list", Toast.LENGTH_SHORT).show()
            }
        })

        viewModel.callAPI()
    }


}
