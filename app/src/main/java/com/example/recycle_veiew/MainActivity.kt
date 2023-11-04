package com.example.recycle_veiew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycle_veiew.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapterDisaster = HeroAdapter(generateDummy()){
                hero -> Toast.makeText(this@MainActivity,
            "You clicked on ${hero.HeroName}",
            Toast.LENGTH_SHORT).show()}

        with(binding) {
            rvHero.apply {
                adapter = adapterDisaster
                layoutManager = LinearLayoutManager(this@MainActivity)
            }
//                rvDisaster.apply {
//                    adapter = adapterDisaster
//                    layoutManager = GridLayoutManager(this@MainActivity, 2)
//                }
        }
    }
}

    fun generateDummy(): List<Hero> {
        return listOf(
            Hero(imageResId = R.drawable.jfk, HeroName = "John F Kennedy", nation = "United States", Born = "May 29, 1917"),
            Hero(imageResId = R.drawable.jackchurchil, HeroName = "Jack Churchil", nation = "Great Britain(Sri lanka)", Born = "September 16, 1906" ),
            Hero(imageResId = R.drawable.meiji, HeroName = "Mutsuhito", nation = "Japan", Born = "November 3, 1852"),
            Hero(imageResId = R.drawable.fredrick, HeroName = "Frederick II", nation = "Germany(Prussia)", Born = "January 24, 1712"),
            Hero(imageResId = R.drawable.hatta, HeroName = "Mohammad Hatta", nation = "Indonesia", Born = "August 12, 1902"),
        )
    }
