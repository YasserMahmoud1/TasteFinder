package com.example.TasteFinder.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.TasteFinder.R
import com.example.TasteFinder.home.HomeActivity
import com.example.TasteFinder.onBoarding.OnBoardingActivity
//import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var backButton :ImageButton
    private lateinit var loginButton: Button
    private lateinit var facebookImageView: ImageView
    private lateinit var googleImageView: ImageView
//    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        loginButton = findViewById(R.id.btnLogin)
        emailEditText = findViewById(R.id.Email_login)
        passwordEditText = findViewById(R.id.Password_login)
        facebookImageView = findViewById(R.id.facebook_login)
        googleImageView = findViewById(R.id.google_login)
        backButton = findViewById(R.id.btnBack)
//        firebaseAuth = FirebaseAuth.getInstance()

        backButton.setOnClickListener{
            val intent = Intent(this, OnBoardingActivity::class.java)
            startActivity(intent)
        }

        loginButton.setOnClickListener {
            loginUser()
        }

        // Set onClick listener for Facebook login
        facebookImageView.setOnClickListener {
            Toast.makeText(this, "Facebook Login", Toast.LENGTH_SHORT).show()
        }

        // Set onClick listener for Google login
        googleImageView.setOnClickListener {
            Toast.makeText(this, "Google Login", Toast.LENGTH_SHORT).show()
        }

    }

    private fun loginUser() {

        val email = emailEditText.text.toString().trim()
        val password = passwordEditText.text.toString().trim()

         if(email.isNotEmpty() && password.isNotEmpty()) {

//                firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
//                    if(it.isSuccessful) {
                        Toast.makeText(this, "Registration Successful!", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, HomeActivity::class.java)
                        startActivity(intent)

//                    }else {
//                        Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
//                    }
                }
//        } else {
//             Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
//        }
    }
}