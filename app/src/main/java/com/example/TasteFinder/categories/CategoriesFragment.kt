package com.example.TasteFinder.categories

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.TasteFinder.data.Category
import com.example.TasteFinder.R
import com.example.TasteFinder.data.Restaurant

class CategoriesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_categories, container, false)

        val topFavoritesRecyclerView = view.findViewById<RecyclerView>(R.id.rv_top_favorites)
        topFavoritesRecyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        topFavoritesRecyclerView.adapter = TopFavoritesAdapter(getTopFavorites())

        val categoriesRecyclerView = view.findViewById<RecyclerView>(R.id.rv_categories)
        categoriesRecyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        categoriesRecyclerView.adapter = CategoriesAdapter(getCategories())

        return view
    }

    private fun getTopFavorites(): List<Restaurant> {

        return listOf(
            Restaurant("Crinkle", 50, R.drawable.image_logo_crinkle),
            Restaurant("Burgista", 30, R.drawable.image_logo_burgsta)
        )
    }

    private fun getCategories(): List<Category> {
        return listOf(
            Category("Burgers", R.drawable.burger_image),
            Category("Pasta", R.drawable.pasta_image)
        )
    }
}
