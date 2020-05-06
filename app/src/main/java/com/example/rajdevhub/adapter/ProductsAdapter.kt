package com.example.rajdevhub.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rajdevhub.R
import com.example.rajdevhub.model.Product

class ProductsAdapter(val context: Context, val productsList: List<Product>, val itemClick : (Product) -> Unit )
    : RecyclerView.Adapter<ProductsAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(context).
            inflate(R.layout.products_list_item, parent, false)
        return ItemViewHolder(view, itemClick)
    }

    override fun getItemCount(): Int {
        return productsList.count()
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
      holder?.bidProduct(context, productsList[position])
    }

    inner class ItemViewHolder(
        itemView: View,
        itemClick: (Product) -> Unit
    ): RecyclerView.ViewHolder(itemView){
        val productImage = itemView?.findViewById<ImageView>(R.id.productImage)
        val productName = itemView?.findViewById<TextView>(R.id.productName)
        val productPrice = itemView?.findViewById<TextView>(R.id.productPrice)
        fun bidProduct(context: Context, product: Product){
            val resourceId = context.resources.getIdentifier(product.image, "drawable",context.packageName)
            productImage.setImageResource(resourceId)
            productName.text = product.title
            productPrice.text = product.price
            itemView.setOnClickListener{itemClick(product)}
        }

    }
}