package com.example.TasteFinder.register

import android.content.Intent
import android.os.Bundle
import android.widget.*
import com.example.TasteFinder.BaseActivity
import com.example.TasteFinder.R
import com.example.TasteFinder.home.HomeActivity
import com.example.TasteFinder.login.LoginActivity


class RegisterActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val nameEditText: EditText = findViewById(R.id.register_name)
        val emailEditText: EditText = findViewById(R.id.register_email)
        val passwordEditText: EditText = findViewById(R.id.register_password)
        val confirmPasswordEditText: EditText = findViewById(R.id.register_confirmPassword)
        val registerButton: Button = findViewById(R.id.registerBtn)
        val loginText: TextView = findViewById(R.id.register_login_text)

        loginText.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }


        registerButton.setOnClickListener {
            registerUser(
                nameEditText.text.toString().trim(),
                emailEditText.text.toString().trim(),
                passwordEditText.text.toString().trim(),
                confirmPasswordEditText.text.toString().trim()
            )
        }


    }

    private fun registerUser(name: String, email: String, password: String, confirmPassword: String) {

        if(name.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty() && confirmPassword.isNotEmpty()) {
            if(password == confirmPassword) {

//                firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
//                    if(it.isSuccessful) {
                        Toast.makeText(this, "Registration Successful!", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, HomeActivity::class.java)
                        startActivity(intent)
                        finish()

//                    }else {
//                        Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
//                    }
//                }
//            }else {
//                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
            }
        }else {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
        }
    }
}
