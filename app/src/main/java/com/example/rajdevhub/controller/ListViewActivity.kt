package com.example.rajdevhub.controller

import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.jonnyb.coderswag.Services.DataService
import com.example.rajdevhub.R
import com.example.rajdevhub.model.Category
import kotlinx.android.synthetic.main.activity_listview.*

class ListViewActivity : BaseActivity() {

    lateinit var  adapter :ArrayAdapter<Category>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, DataService.categories)
        categorieslistView.adapter= adapter;

    }

}