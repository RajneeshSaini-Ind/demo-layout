package com.example.rajdevhub.controller

import android.content.Intent
import android.os.Bundle
import android.provider.SyncStateContract
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rajdevhub.adapter.CategoryRecyclerViewAdapter
import com.example.jonnyb.coderswag.Services.DataService
import com.example.rajdevhub.R
import com.example.rajdevhub.utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_recyclerview.*

class RecyclerViewActivity : BaseActivity() {
    lateinit var adapter: CategoryRecyclerViewAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)
        //adapter = CategoryRecyclerViewAdapter(this, DataService.categories)
        adapter = CategoryRecyclerViewAdapter(this, DataService.categories) { category ->
           // Toast.makeText(this, "Clicked the category ${category.title}", Toast.LENGTH_LONG).show()
            val intent = Intent(this, ProductActivity::class.java)
            intent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(intent)
        }
        recyclerView.adapter = adapter
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)

    }
}