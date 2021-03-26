package com.example.calorie2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secondsc)

        var username_enter : TextView = findViewById(R.id.PersonName)
        var user_age_enter : TextView = findViewById(R.id.Age)
        var user_gender_enter : TextView = findViewById(R.id.Gender)


        findViewById<Button>(R.id.btnOpenMain).setOnClickListener{
            val intent : Intent = Intent(this@MainActivity2, HomeSc::class.java)
            startActivity(intent)

        }

        findViewById<Button>(R.id.Proceed).setOnClickListener{
            val username = username_enter.text.toString()
            val age = user_age_enter.text.toString()
            val gender = user_gender_enter.text.toString()

            when {
                username.isEmpty() -> {
                    Toast.makeText(this, "Enter Your Name", Toast.LENGTH_SHORT).show()
                }
                age.isEmpty() -> {
                    Toast.makeText(this, "Enter Your Age", Toast.LENGTH_SHORT).show()
                }
                gender.isEmpty() -> {
                    Toast.makeText(this, "Enter Your Gender", Toast.LENGTH_SHORT).show()
                }
                else -> {
                    val intent : Intent = Intent(this@MainActivity2, MainActivity::class.java)
                    intent.putExtra("username", username)
                    intent.putExtra("age", age)
                    intent.putExtra("gender", age)
                    startActivity(intent)
                }
            }
        }
    }
}