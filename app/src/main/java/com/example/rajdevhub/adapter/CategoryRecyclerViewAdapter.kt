package com.example.rajdevhub.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rajdevhub.R
import com.example.rajdevhub.model.Category

//class CategoryRecyclerViewAdapter(val context: Context, val categories: List<Category>) :
class CategoryRecyclerViewAdapter(val context: Context, val categories: List<Category>, val itemClick : (Category) -> Unit) :
    RecyclerView.Adapter<CategoryRecyclerViewAdapter.ItemViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(context).
            inflate(R.layout.category_list_item, parent,false)
        return ItemViewHolder(view, itemClick)


    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder?.bindCategory(categories[position],context)
    }

    inner class ItemViewHolder(itemView : View, val itemClick : (Category) -> Unit) : RecyclerView.ViewHolder(itemView){
        val categoryTitle = itemView?.findViewById<TextView>(R.id.txtCategoryName)
        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        fun bindCategory(category: Category, context: Context){
            val resourceId = context.resources.getIdentifier(category.image,"drawable", context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryTitle.text= category.title
            itemView.setOnClickListener{itemClick(category)}
        }
    }
}