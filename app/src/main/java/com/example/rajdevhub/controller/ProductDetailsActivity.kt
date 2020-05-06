package com.example.rajdevhub.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.rajdevhub.R
import com.example.rajdevhub.model.Product
import com.example.rajdevhub.utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_details.*

class ProductDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_details)
        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)
        productTitle.text= product.title
        productPrice.text= product.price
        val resourceId= this.resources.getIdentifier(product.image,"drawable",this.packageName)
        //productImage.setBackgroundResource(resourceId)
        productImage.setImageResource(resourceId)
    }

    fun addToCart(view: View) {
        Toast.makeText(this, "This item saved in your Cart!!", Toast.LENGTH_LONG).show()
    }
}
