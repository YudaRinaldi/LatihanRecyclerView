package com.example.latihanrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.latihanrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listStudent = arrayListOf(
            MyContact(
                "20102201",
                "Yuda Rinaldi",
                "085156437831",
                "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg.webp"
            ),
            MyContact(
                "20102202",
                "Yuda ",
                "085156437832",
                "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg.webp"
            ),
            MyContact(
                "20102203",
                "Rinaldi",
                "085156437833",
                "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg.webp"
            ),
            MyContact(
                "20102204",
                "Rinaldi Yuda",
                "085156437834",
                "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg.webp"
            ),
            MyContact(
                "20102205",
                "Yuda Keling",
                "085156437835",
                "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg.webp"
            ),
            MyContact(
                "20102206",
                "Tukul Rinaldi",
                "085156437836",
                "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg.webp"
            ),
            MyContact(
                "20102201",
                "Yuda Rinaldi",
                "085156437831",
                "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg.webp"
            ),
            MyContact(
                "20102202",
                "Yuda ",
                "085156437832",
                "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg.webp"
            ),
            MyContact(
                "20102203",
                "Rinaldi",
                "085156437833",
                "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg.webp"
            ),
            MyContact(
                "20102204",
                "Rinaldi Yuda",
                "085156437834",
                "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg.webp"
            ),
            MyContact(
                "20102205",
                "Yuda Keling",
                "085156437835",
                "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg.webp"
            ),
            MyContact(
                "20102206",
                "Tukul Rinaldi",
                "085156437836",
                "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg.webp"
            ),
            MyContact(
                "20102201",
                "Yuda Rinaldi",
                "085156437831",
                "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg.webp"
            ),
            MyContact(
                "20102202",
                "Yuda ",
                "085156437832",
                "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg.webp"
            ),
            MyContact(
                "20102203",
                "Rinaldi",
                "085156437833",
                "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg.webp"
            ),
            MyContact(
                "20102204",
                "Rinaldi Yuda",
                "085156437834",
                "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg.webp"
            ),
            MyContact(
                "20102205",
                "Yuda Keling",
                "085156437835",
                "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg.webp"
            ),
            MyContact(
                "20102206",
                "Tukul Rinaldi",
                "085156437836",
                "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg.webp"
            ),
            MyContact(
                "20102201",
                "Yuda Rinaldi",
                "085156437831",
                "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg.webp"
            ),
            MyContact(
                "20102202",
                "Yuda ",
                "085156437832",
                "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg.webp"
            ),
            MyContact(
                "20102203",
                "Rinaldi",
                "085156437833",
                "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg.webp"
            ),
            MyContact(
                "20102204",
                "Rinaldi Yuda",
                "085156437834",
                "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg.webp"
            ),
            MyContact(
                "20102205",
                "Yuda Keling",
                "085156437835",
                "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg.webp"
            ),
            MyContact(
                "20102206",
                "Tukul Rinaldi",
                "085156437836",
                "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg.webp"
            )
        )
        listView(listStudent)

    }

    private fun listView(value: ArrayList<MyContact>) {
        val adapter = ListViewAdapter(this,value)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter

    }

    private fun gridView(value: ArrayList<MyContact>) {
        val adapter = GridViewAdapter(this,value)

        val layoutManager = GridLayoutManager(this,2, LinearLayoutManager.VERTICAL, false)

        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter

    }

    private fun cardView(value: ArrayList<MyContact>) {
        val adapter = CardViewAdapter(this,value)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }
}




