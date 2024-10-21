package com.example.tastefinder.categories

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tastefinder.data.Category
import com.example.tastefinder.R

class CategoriesAdapter(private val categoryList: List<Category>) :
    RecyclerView.Adapter<CategoriesAdapter.CategoryViewHolder>() {

    class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val categoryName: TextView = itemView.findViewById(R.id.category_name)
        val categoryIcon: ImageView = itemView.findViewById(R.id.category_icon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
        return CategoryViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val currentCategory = categoryList[position]
        holder.categoryName.text = currentCategory.name
        holder.categoryIcon.setImageResource(currentCategory.iconResId)
    }

    override fun getItemCount() = categoryList.size
}