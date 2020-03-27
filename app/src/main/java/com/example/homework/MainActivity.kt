package com.example.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }
    private fun init() {

        logInButton.setOnClickListener {

            if (emailEditText.text.toString().isNotEmpty() && passwordEditText.text.toString().isNotEmpty()){
                Toast.makeText(this, "Log In is Successful", LENGTH_LONG).show()

            }else {

                Toast.makeText(this, "Please fill in the blanks", LENGTH_LONG).show()

            }
        }
    }
}
