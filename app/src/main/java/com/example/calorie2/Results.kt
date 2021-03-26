package com.example.calorie2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_results.*
import org.w3c.dom.Text

class Results : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

//        val total_calories = intent.getStringExtra("totalcal")
//        size.text = "$total_calories"
        val total_calories = findViewById<TextView>(R.id.Total)
        findViewById<TextView>(R.id.size).text = "$total_calories"

        val gender = intent.getStringExtra("gender")
        if(gender=="male" || gender == "Male") {
            if (R.id.Age <= 3 && R.id.Age > 0) {
                if (R.id.Total>=900 && R.id.Total<=1100)
                    result_statement.text = "The calorific value of your dish is within optimal limits, Enjoy your meal!"
                else
                    result_statement.text = "The calorific value of your dish is not within optimal limits. We recommend you to consider revising your ingredients or their quatities"
            }
            else if(R.id.Age<=8){
                if(R.id.Total>=1400&& R.id.Total<=1600)
                    result_statement.text = "The calorific value of your dish is within optimal limits, Enjoy your meal!"
                else
                    result_statement.text = "The calorific value of your dish is not within optimal limits. We recommend you to consider revising your ingredients or their quatities"

            }
            else if(R.id.Age<=13){
                if(R.id.Total>=1800&& R.id.Total<=2200)
                    result_statement.text = "The calorific value of your dish is within optimal limits, Enjoy your meal!"
                else
                    result_statement.text = "The calorific value of your dish is not within optimal limits. We recommend you to consider revising your ingredients or their quatities"
            }
            else if(R.id.Age<=18){
                if(R.id.Total>=2400&& R.id.Total<=2800)
                    result_statement.text = "The calorific value of your dish is within optimal limits, Enjoy your meal!"
                else
                    result_statement.text = "The calorific value of your dish is not within optimal limits. We recommend you to consider revising your ingredients or their quatities"
            }
            else if(R.id.Age<=30){
                if(R.id.Total>=2600&& R.id.Total<=2800)
                    result_statement.text = "The calorific value of your dish is within optimal limits, Enjoy your meal!"
                else
                    result_statement.text = "The calorific value of your dish is not within optimal limits. We recommend you to consider revising your ingredients or their quatities"
            }
            else if(R.id.Age<=50){
                if(R.id.Total>=2400 && R.id.Total<=2600)
                    result_statement.text = "The calorific value of your dish is within optimal limits, Enjoy your meal!"
                else
                    result_statement.text = "The calorific value of your dish is not within optimal limits. We recommend you to consider revising your ingredients or their quatities"}
            else if(R.id.Age>=51){
                if(R.id.Total>=2200 && R.id.Total<=2400)
                    result_statement.text = "The calorific value of your dish is within optimal limits, Enjoy your meal!"
                else
                    result_statement.text = "The calorific value of your dish is not within optimal limits. We recommend you to consider revising your ingredients or their quatities"
            }
            else
                result_statement.text = "Sorry! We do not have any data about the optimal calorific intake for your age. We may add it in future updates."
        }

        else if(gender=="Female"|| gender=="female"){
            if (R.id.Age<=3 && R.id.Age>0) {
                if (R.id.Total>=900 && R.id.Total<=1100)
                    result_statement.text = "The calorific value of your dish is within optimal limits, Enjoy your meal!"
                else
                    result_statement.text = "The calorific value of your dish is not within optimal limits. We recommend you to consider revising your ingredients or their quatities"
            }
            else if(R.id.Age <=8){
                if(R.id.Total>=1400 && R.id.Total<=1600)
                    result_statement.text = "The calorific value of your dish is within optimal limits, Enjoy your meal!"
                else
                    result_statement.text = "The calorific value of your dish is not within optimal limits. We recommend you to consider revising your ingredients or their quatities"

            }
            else if(R.id.Age <=13){
                if(R.id.Total>=1600 && R.id.Total<=2000)
                    result_statement.text = "The calorific value of your dish is within optimal limits, Enjoy your meal!"
                else
                    result_statement.text = "The calorific value of your dish is not within optimal limits. We recommend you to consider revising your ingredients or their quatities"
            }
            else if(R.id.Age <=18){
                if(R.id.Total >= 2000 && R.id.Total <= 2400)
                    result_statement.text = "The calorific value of your dish is within optimal limits, Enjoy your meal!"
                else
                    result_statement.text = "The calorific value of your dish is not within optimal limits. We recommend you to consider revising your ingredients or their quatities"
            }
            else if(R.id.Age <=30){
                if(R.id.Total >= 2000 && R.id.Total <= 2200)
                    result_statement.text = "The calorific value of your dish is within optimal limits, Enjoy your meal!"
                else
                    result_statement.text = "The calorific value of your dish is not within optimal limits. We recommend you to consider revising your ingredients or their quatities"
            }
            else if(R.id.Age <=50){
                if(R.id.Total >= 2000 && R.id.Total <= 2200)
                    result_statement.text = "The calorific value of your dish is within optimal limits, Enjoy your meal!"
                else
                    result_statement.text = "The calorific value of your dish is not within optimal limits. We recommend you to consider revising your ingredients or their quatities"}
            else if( R.id.Age >=51){
                if(R.id.Total >= 1800 && R.id.Total <= 2000)
                    result_statement.text = "The calorific value of your dish is within optimal limits, Enjoy your meal!"
                else
                    result_statement.text = "The calorific value of your dish is not within optimal limits. We recommend you to consider revising your ingredients or their quatities"
            }
            else
                result_statement.text = "Sorry! We do not have any data about the optimal calorific intake for your age. We may add it in future updates."
        }
    }
}