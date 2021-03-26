package com.example.calorie2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home_sc.*

class HomeSc : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_sc)

        findViewById<Button>(R.id.homepage).setOnClickListener{
            val intent : Intent = Intent(this@HomeSc, MainActivity2::class.java)
            startActivity(intent)
        }

    }
}