package com.example.TasteFinder.home

import android.os.Bundle
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.TasteFinder.BaseActivity
import com.example.TasteFinder.categories.CategoriesFragment
import com.example.TasteFinder.nearBy.NearbyFragment
import com.example.TasteFinder.R
import com.example.TasteFinder.favourite.FavoritesFragment
import com.example.TasteFinder.search.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : BaseActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        // Set the default fragment to CategoriesFragment
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, CategoriesFragment())
                .commit()
        }

        bottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnItemSelectedListener { item: MenuItem ->
            when (item.itemId) {
                R.id.nav_home -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, CategoriesFragment())
                        .addToBackStack(null)
                        .commit()
                }
                R.id.nav_favorites -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, FavoritesFragment())
                        .addToBackStack(null)
                        .commit()
                }
                R.id.nav_search -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, SearchFragment())
                        .addToBackStack(null)
                        .commit()
                }
                R.id.nav_location -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, NearbyFragment())
                        .addToBackStack(null)
                        .commit()
                }
            }
            true
        }
    }

}

