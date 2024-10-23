package com.example.TasteFinder.data

data class Restaurant(
    val id : String,
    val name: String,
    val location: String,
    val menu: List<String>,
    val phoneNumbers: List<String>,
    val categories: List<String>,
    val likes : Int,
    val imageURL: String,
    val facebookLink: String,
)
