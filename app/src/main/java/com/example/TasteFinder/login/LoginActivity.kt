package com.example.TasteFinder.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.TasteFinder.BaseActivity
import com.example.TasteFinder.R
import com.example.TasteFinder.home.HomeActivity
import com.example.TasteFinder.onBoarding.OnBoardingActivity
import com.example.TasteFinder.register.RegisterActivity
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : BaseActivity() {

    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        loginButton = findViewById(R.id.btnLogin)
        emailEditText = findViewById(R.id.Email_login)
        passwordEditText = findViewById(R.id.Password_login)
        firebaseAuth = FirebaseAuth.getInstance()
        val signInWithGoogle = findViewById<LinearLayout>(R.id.sign_in_with_google)
        val registerText = findViewById<TextView>(R.id.login_register_text)

        registerText.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }

        signInWithGoogle.setOnClickListener {
            Toast.makeText(this, "Google Login", Toast.LENGTH_SHORT).show()
        }

        loginButton.setOnClickListener {
            loginUser()
        }



    }

    private fun loginUser() {

        val email = emailEditText.text.toString().trim()
        val password = passwordEditText.text.toString().trim()

         if(email.isNotEmpty() && password.isNotEmpty()) {

//                firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
//                    if(it.isSuccessful) {
                        Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, HomeActivity::class.java)
                        startActivity(intent)
                        finish()

//                    }else {
//                        Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
//                    }
                }
//        } else {
//             Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
//        }
    }
}