package com.example.recycle_veiew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun generateDummy(): List<Hero> {
        return listOf(
            Hero(imageResId = R.drawable.musashi, HeroName = "Musashi", nation = "Miyamoto", wafat = "13 Juni 1645"),
            Hero(imageResId = R.drawable.hondatadakatsu, HeroName = "Honda Tadakatsu", nation = "Tokugawa", wafat = "3 Desember 1610" ),
            Hero(imageResId = R.drawable.odanobunaga, HeroName = "Oda Nobunaga", nation = "Oda", wafat = "21 Juni 1582"),
            Hero(imageResId = R.drawable.ieyasu_tokugawa, HeroName = "Ieyasu Tokugawa", nation = "Tokugawa", wafat = "1 Juni 1616"),
            Hero(imageResId = R.drawable.shingentakeda, HeroName = "Shingen Takeda", nation = "Takeda", wafat = "13 Mei 1573"),
            Hero(imageResId = R.drawable.chosokabe, HeroName = "Chosokabe Motochika", nation = "Chosokabe", wafat = "11 Juli 1599"),
            Hero(imageResId = R.drawable.motonari, HeroName = "Mori Motonari", nation = "Mori", wafat = "6 Juli 1571"),
        )
    }
}