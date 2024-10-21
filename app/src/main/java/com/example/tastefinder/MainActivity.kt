package com.example.tastefinder

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.tastefinder.onBoarding.OnBoardingActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val intent = Intent(this, OnBoardingActivity::class.java)
        startActivity(intent)

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