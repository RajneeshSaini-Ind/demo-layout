package com.example.rajdevhub.controller

import android.os.Bundle
import com.example.rajdevhub.R
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : BaseActivity() {

    val foodList = arrayListOf("Bread", "Rice", "Shop")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        decideBTN.setOnClickListener{
            val random= Random()
            val randomIndex= random.nextInt(foodList.count())
            txtFoodName.text= foodList[randomIndex]
        }
        addFoodBtn.setOnClickListener {
            val foodName= edtFoodName.text.toString()
            foodList.add(foodName)
            edtFoodName.text.clear()
        }

    }
}
