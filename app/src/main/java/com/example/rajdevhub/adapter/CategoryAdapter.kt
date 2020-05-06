package com.example.rajdevhub.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.rajdevhub.R
import com.example.rajdevhub.model.Category

class CategoryAdapter(val context: Context, val categories: List<Category>): BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView : View
        val holder : ViewHolder
        if(convertView==null) {
            categoryView= LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder= ViewHolder()
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryTitle = categoryView.findViewById(R.id.txtCategoryName)
            categoryView.tag= holder
            println("I exist for first time")
        }else{
            holder = convertView?.tag as ViewHolder
            categoryView =convertView

            println("Go green Recycler")
        }
//        categoryView= LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
//        val categoryImage : ImageView = categoryView.findViewById(R.id.categoryImage)
//        val categoryName : TextView = categoryView.findViewById(R.id.txtCategoryName)
        //println("Heavy Computing")
        val category = categories[position]
        holder.categoryTitle?.text= category.title
        val resourceId= context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemId(position: Int): Long {
        return 0
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCount(): Int {
        return categories.count()
    }

    private class ViewHolder{
        var categoryImage : ImageView?=null
        var categoryTitle : TextView?=null
    }
}