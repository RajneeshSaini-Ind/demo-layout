package com.example.rajdevhub.controller

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.adapter.CategoryAdapter
import com.example.jonnyb.coderswag.Services.DataService
import com.example.rajdevhub.R
import com.example.rajdevhub.model.Category
import kotlinx.android.synthetic.main.activity_listview.*

class ListViewActivity : BaseActivity() {

    lateinit var  adapter :CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)
        adapter = CategoryAdapter(this,  DataService.categories)
        categorieslistView.adapter= adapter;

        /*categorieslistView.setOnItemClickListener { adapter, view, position, id ->
            val category= DataService.categories[position]
            Toast.makeText(this, "You clicked on ${category.title}",Toast.LENGTH_LONG).show()
        }*/

    }

}