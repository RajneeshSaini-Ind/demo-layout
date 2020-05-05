package com.example.rajdevhub.controller

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.adapter.CategoryRecyclerViewAdapter
import com.example.jonnyb.coderswag.Services.DataService
import com.example.rajdevhub.R
import kotlinx.android.synthetic.main.activity_recyclerview.*

class RecyclerViewActivity: BaseActivity() {
    lateinit var adapter: CategoryRecyclerViewAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)
        adapter = CategoryRecyclerViewAdapter(this, DataService.categories)
        recyclerView.adapter= adapter
        val layoutManager= LinearLayoutManager(this)
        recyclerView.layoutManager=layoutManager
        recyclerView.setHasFixedSize(true)

    }
}