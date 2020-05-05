package com.example.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rajdevhub.R
import com.example.rajdevhub.model.Category
import kotlinx.android.synthetic.main.activity_listview.view.*

class CategoryRecyclerViewAdapter(val context: Context, val categories: List<Category>) :
    RecyclerView.Adapter<CategoryRecyclerViewAdapter.ItemViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(context).
            inflate(R.layout.category_list_item, parent,false)
        return ItemViewHolder(view)


    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder?.bindCategory(categories[position],context)
    }

    inner class ItemViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val categoryTitle = itemView?.findViewById<TextView>(R.id.txtCategoryName)
        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        fun bindCategory(category: Category, context: Context){
            val resourceId = context.resources.getIdentifier(category.image,"drawable", context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryTitle.text= category.title
        }
    }
}