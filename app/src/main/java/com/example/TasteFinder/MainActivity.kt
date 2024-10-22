package com.example.TasteFinder

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.TasteFinder.onBoarding.OnBoardingActivity
import com.google.firebase.firestore.FirebaseFirestore

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val intent = Intent(this, OnBoardingActivity::class.java)
        startActivity(intent)

        val db = FirebaseFirestore.getInstance()
        val collectionRef = db.collection("Restaurants").get().addOnSuccessListener {
                documents ->
            for (document in documents) {
                // Process the filtered data
                Log.d("Firestore", "${document.id} => ${document.data}")
            }
        }

//        TODO add firebase auth here
//        val user = FirebaseAuth.getInstance().currentUser
//        if (user == null) {
//            startActivity(Intent(this, OnBoardingActivity::class.java))
//        } else {
//            startActivity(Intent(this, HomeActivity::class.java))  // Direct to home if authenticated
//        }
        finish()



    }
}