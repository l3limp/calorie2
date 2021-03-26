package com.example.calorie2

import android.annotation.SuppressLint
import android.content.Intent
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

        go_back.setOnClickListener {
            val intent: Intent = Intent(this@Results, MainActivity::class.java)
            startActivity(intent)
        }
        var size: TextView = findViewById(R.id.size)
        size.text = intent.getStringExtra("totalcal")
        var resStatement: TextView = findViewById<TextView>(R.id.result_statement)
        val totalCal: String = size.text.toString()
        val age = intent.getStringExtra("age")
        val gender = intent.getStringExtra("gender")
        if (gender == "male" || gender == "Male") {
            if (age != null) {
                if (age.toInt() <= 3 && age.toInt() > 0) {
                    if (totalCal.toInt() >= 900 && totalCal.toInt() <= 1100)
                        resStatement.text =
                            "The calorific value of your dish is within optimal limits, Enjoy your meal!"
                    else
                        resStatement.text =
                            "The calorific value of your dish is not within optimal limits. We recommend you to consider revising your ingredients or their quatities"
                }
                if (age.toInt() <= 8) {
                    if (totalCal.toInt() >= 1400 && totalCal.toInt() <= 1600)
                        resStatement.text =
                            "The calorific value of your dish is within optimal limits, Enjoy your meal!"
                    else
                        resStatement.text =
                            "The calorific value of your dish is not within optimal limits. We recommend you to consider revising your ingredients or their quatities"

                } else if (age.toInt() <= 13) {
                    if (totalCal.toInt() >= 1800 && totalCal.toInt() <= 2200)
                        resStatement.text =
                            "The calorific value of your dish is within optimal limits, Enjoy your meal!"
                    else
                        resStatement.text =
                            "The calorific value of your dish is not within optimal limits. We recommend you to consider revising your ingredients or their quatities"
                }
                if (age.toInt() <= 18) {
                    if (totalCal.toInt() >= 2400 && totalCal.toInt() <= 2800)
                        resStatement.text =
                            "The calorific value of your dish is within optimal limits, Enjoy your meal!"
                    else
                        resStatement.text =
                            "The calorific value of your dish is not within optimal limits. We recommend you to consider revising your ingredients or their quatities"

                    if (age.toInt() <= 30) {
                        if (totalCal.toInt() >= 2600 && totalCal.toInt() <= 2800)
                            resStatement.text =
                                "The calorific value of your dish is within optimal limits, Enjoy your meal!"
                        else
                            resStatement.text =
                                "The calorific value of your dish is not within optimal limits. We recommend you to consider revising your ingredients or their quatities"
                        if (age.toInt() <= 50) {
                            if (totalCal.toInt() >= 2400 && totalCal.toInt() <= 2600)
                                resStatement.text =
                                    "The calorific value of your dish is within optimal limits, Enjoy your meal!"
                            else
                                resStatement.text =
                                    "The calorific value of your dish is not within optimal limits. We recommend you to consider revising your ingredients or their quatities"
                        } else if (age.toInt() >= 51) {
                            if (totalCal.toInt() >= 2200 && totalCal.toInt() <= 2400)
                                resStatement.text =
                                    "The calorific value of your dish is within optimal limits, Enjoy your meal!"
                            else
                                resStatement.text =
                                    "The calorific value of your dish is not within optimal limits. We recommend you to consider revising your ingredients or their quatities"
                        } else
                            resStatement.text =
                                "Sorry! We do not have any data about the optimal calorific intake for your age. We may add it in future updates."
                    }
                }
            }
        }

        else if(gender=="Female"|| gender=="female"){
            if (age != null) {
                if (age.toInt()<=3 && age.toInt()>0) {
                    if (totalCal.toInt()>=900 && totalCal.toInt()<=1100)
                        resStatement.text = "The calorific value of your dish is within optimal limits, Enjoy your meal!"
                    else
                        resStatement.text = "The calorific value of your dish is not within optimal limits. We recommend you to consider revising your ingredients or their quatities"
                } else if(age.toInt() <=8){
                    if(totalCal.toInt()>=1400 && totalCal.toInt()<=1600)
                        resStatement.text = "The calorific value of your dish is within optimal limits, Enjoy your meal!"
                    else
                        resStatement.text = "The calorific value of your dish is not within optimal limits. We recommend you to consider revising your ingredients or their quatities"

                } else if(age.toInt() <=13){
                    if(totalCal.toInt()>=1600 && totalCal.toInt()<=2000)
                        resStatement.text = "The calorific value of your dish is within optimal limits, Enjoy your meal!"
                    else
                        result_statement.text = "The calorific value of your dish is not within optimal limits. We recommend you to consider revising your ingredients or their quatities"
                } else if(age.toInt() <=18){
                    if(totalCal.toInt() >= 2000 && totalCal.toInt() <= 2400)
                        resStatement.text = "The calorific value of your dish is within optimal limits, Enjoy your meal!"
                    else
                        resStatement.text = "The calorific value of your dish is not within optimal limits. We recommend you to consider revising your ingredients or their quatities"
                } else if(age.toInt() <=30){
                    if(totalCal.toInt() >= 2000 && totalCal.toInt() <= 2200)
                        resStatement.text = "The calorific value of your dish is within optimal limits, Enjoy your meal!"
                    else
                        resStatement.text = "The calorific value of your dish is not within optimal limits. We recommend you to consider revising your ingredients or their quatities"
                } else if(age.toInt() <=50){
                    if(totalCal.toInt() >= 2000 && totalCal.toInt() <= 2200)
                        resStatement.text = "The calorific value of your dish is within optimal limits, Enjoy your meal!"
                    else
                        resStatement.text = "The calorific value of your dish is not within optimal limits. We recommend you to consider revising your ingredients or their quatities"} else if( age.toInt() >=51){
                    if(totalCal.toInt() >= 1800 && totalCal.toInt() <= 2000)
                        resStatement.text = "The calorific value of your dish is within optimal limits, Enjoy your meal!"
                    else
                        resStatement.text = "The calorific value of your dish is not within optimal limits. We recommend you to consider revising your ingredients or their quatities"
                } else
                    resStatement.text = "Sorry! We do not have any data about the optimal calorific intake for your age. We may add it in future updates."
            }
        }
    }
}