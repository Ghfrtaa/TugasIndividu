package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Item>
    lateinit var imageid : Array<Int>

    lateinit var heading : Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageid = arrayOf(
            R.drawable.kucing,
            R.drawable.mobil,
            R.drawable.motor,
            R.drawable.msib,
            R.drawable.vw,
            R.drawable.ets2,
            R.drawable.lambo,
            R.drawable.subaru
        )
        heading = arrayOf(
            "Ini adalah gambar kucing",
            "Ini Adalah gambar mobil",
            "ini adalah gambar motor",
            "Ini adalah logo dari kampus merdeka mengenai sistem Magang studi independent bersertfikat",
            "Ini Adalah mobil VW",
            "Ini adalah game euro truck simulator 2 ",
            "ini adalah mobil lamborghini",
            "Ini adalah mobil subaru wrx STI"
        )
        newRecyclerView = findViewById(R.id.recycleView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Item>()
        getUserData()
    }

    private fun getUserData() {

        for (i in imageid.indices) {

            val item = Item(imageid[i], heading[i])
            newArrayList.add(item)
        }

        newRecyclerView.adapter = MyAdapter(newArrayList)

    }
}