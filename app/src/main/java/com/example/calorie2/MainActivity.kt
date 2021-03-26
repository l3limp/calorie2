package com.example.calorie2

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ItemAdapter.OnItemClickListener {

    private val itemsList = ArrayList<Item>()
    var total : Int = 0
    lateinit var total_count : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        total_count  = findViewById(R.id.Total)

        clear_button.setOnClickListener{
            findViewById<TextView>(R.id.Total).text = "0"
            total = 0
        }
        results_page.setOnClickListener{
            val totalCount: String = total_count.text.toString()
            val intent : Intent = Intent(this@MainActivity, Results::class.java)
            intent.putExtra("totalcal",totalCount)
            startActivity(intent)

        }

        setupData()
        initRV()

    }
    override fun onItemClick(position: Int) {
        total += itemsList[position].calories
        total_count.text = total.toString()
    }


        private fun setupData(){
            val item1 = Item("Milk", R.drawable.milk, 220 , "Add 50ml")
            val item2 = Item("Egg", R.drawable.egg, 760 , "Add 1")
            val item3 = Item("Potato", R.drawable.potato, 420, "Add 100g")
            val item4 = Item("Banana", R.drawable.banana, 690, "Add 100g")
            val item5 = Item("Bread", R.drawable.bread, 1250, "Add 50g")
            val item6 = Item("Chicken", R.drawable.chicken, 580, "Add 100g")
            val item7 = Item("Fish", R.drawable.fish, 290, "Add 100g")
            val item8 = Item("Lentils", R.drawable.lentils, 590, "Add 50g")
            val item9 = Item("Oats", R.drawable.oats, 600, "Add 50g")
            val item10 = Item("Paneer", R.drawable.paneer, 750, "Add 50g")
            val item11 = Item("Rice", R.drawable.rice, 750, "Add 50g")
            val item12 = Item("Tomato", R.drawable.tomato, 569, "Add 100g")
            val item13 = Item("Blank", R.drawable.blank, 0, "-")

            itemsList.add(item1)
            itemsList.add(item2)
            itemsList.add(item3)
            itemsList.add(item4)
            itemsList.add(item5)
            itemsList.add(item6)
            itemsList.add(item7)
            itemsList.add(item8)
            itemsList.add(item9)
            itemsList.add(item10)
            itemsList.add(item11)
            itemsList.add(item12)
            itemsList.add(item13)

        }


        private fun initRV(){
            itemRecyclerView.layoutManager = LinearLayoutManager(this)
            val mAdapter = ItemAdapter(this, itemsList, this)
            itemRecyclerView.adapter = mAdapter
            mAdapter.notifyDataSetChanged()
        }

}