package com.example.rajdevhub.controller

import android.content.Intent
import android.os.Bundle
import com.example.rajdevhub.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        /*foodDemo.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })
        layoutDemo.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, LayoutActivity::class.java)
            startActivity(intent)
        })*/

        foodDemo.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        layoutDemo.setOnClickListener{
            val intent = Intent(this, LayoutActivity::class.java)
            startActivity(intent)
        }
        btnListView.setOnClickListener {
            val intent = Intent(this, ListViewActivity::class.java)
            startActivity(intent)
        }
        btnRecyclerView.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}
