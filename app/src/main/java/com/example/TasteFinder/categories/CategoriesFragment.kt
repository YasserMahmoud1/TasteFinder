package com.example.TasteFinder.categories

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.TasteFinder.R
import com.example.TasteFinder.data.Category
import com.example.TasteFinder.data.Restaurant

class CategoriesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_categories, container, false)

        // Top Favorites RecyclerView (Horizontal Linear Layout)
        val topFavoritesRecyclerView = view.findViewById<RecyclerView>(R.id.rv_top_favorites)
        topFavoritesRecyclerView.layoutManager = LinearLayoutManager(
            requireContext(), LinearLayoutManager.HORIZONTAL, false
        )
//        topFavoritesRecyclerView.adapter = TopFavoritesAdapter(getTopFavorites())

        // Categories RecyclerView (Grid Layout with 2 rows)
        val categoriesRecyclerView = view.findViewById<RecyclerView>(R.id.rv_categories)
        val spanCount = 3 // Number of rows
        val gridLayoutManager = GridLayoutManager(requireContext(), spanCount, GridLayoutManager.HORIZONTAL, false)
        categoriesRecyclerView.layoutManager = gridLayoutManager
        categoriesRecyclerView.adapter = CategoriesAdapter(getCategories())

        return view
    }
//
//    private fun getTopFavorites(): List<Restaurant> {
//        return listOf(
//            Restaurant("Crinkle", 50, R.drawable.image_logo_crinkle),
//            Restaurant("Burgista", 30, R.drawable.image_logo_burgsta)
//        )
//    }

    private fun getCategories(): List<Category> {
        return listOf(
            Category("Burger", R.drawable.burger),
            Category("Pasta", R.drawable.pasta),
            Category("Pizza", R.drawable.pizza),
            Category("Shawerma", R.drawable.shawerma),
            Category("Sea food", R.drawable.sea_food),
            Category("Fried chicken", R.drawable.fried_chicken),
            Category("Dessert", R.drawable.dessert),
            Category("Café", R.drawable.cafe),
            Category("Others", R.drawable.other)
        )
    }
}
