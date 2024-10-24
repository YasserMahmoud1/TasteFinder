package com.example.TasteFinder.restaurantDetails

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.TasteFinder.R
import com.example.TasteFinder.data.Restaurant

class RestaurantDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_restaurant_details)
        val restaurant = intent.getSerializableExtra("restaurant") as Restaurant
        Log.d("RestaurantDetailsActivity", "Received restaurant: $restaurant")

//        TODO add Restaurant Details Here
    }
}