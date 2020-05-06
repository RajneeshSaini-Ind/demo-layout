package com.example.rajdevhub.controller

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jonnyb.coderswag.Services.DataService
import com.example.rajdevhub.R
import com.example.rajdevhub.adapter.ProductsAdapter
import com.example.rajdevhub.utilities.EXTRA_CATEGORY
import com.example.rajdevhub.utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    lateinit var adapter : ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        txtCategoryName.text= categoryType
        adapter = ProductsAdapter(this, DataService.getProducts(categoryType)){product ->
            val intent = Intent(this, ProductDetailsActivity::class.java)
            intent.putExtra(EXTRA_PRODUCT, product)
            startActivity(intent)

        }
        recyclerView.adapter=adapter
        //val layoutManger= LinearLayoutManager(this)
        var spanCount =2
        val orientation = resources.configuration.orientation
        if(orientation==Configuration.ORIENTATION_LANDSCAPE){
            spanCount=3
        }
        val layoutManger= GridLayoutManager(this,spanCount)
        recyclerView.layoutManager= layoutManger
        recyclerView.setHasFixedSize(true)

        //ProductDetailsActivity

     }
}
