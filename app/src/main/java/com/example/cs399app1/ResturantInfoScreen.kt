package com.example.cs399app1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_random_resturant_screen.*
import kotlinx.android.synthetic.main.activity_resturant_info_screen.*
import kotlinx.android.synthetic.main.activity_resturant_info_screen.nameOfRestaurant

class ResturantInfoScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resturant_info_screen)

        val bundle = intent.extras

        nameOfRestaurant.text = bundle.getCharSequence("restaurantName")
        cuisineType.text = bundle.getCharSequence("cuisineType")
        restaurantImage.setImageResource(bundle.getInt("restaurantImage"))
        Log.d("IMAGERESOURCE", bundle.getInt("restaurantImage").toString())
        restaurantInfo1.text = bundle.getCharSequence("restaurantInfo1")
        restaurantInfo2.text = bundle.getCharSequence("restaurantInfo2")


        btnBack.setOnClickListener{
            val intent = Intent(this, RandomResturantScreen::class.java)
            startActivity(intent)
        }

        btnRestart.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnGetDirection.setOnClickListener {
            val intentUri = Uri.parse("geo:0,0?q=" + restaurantInfo2.text)
            val mapIntent = Intent(Intent.ACTION_VIEW, intentUri)
            startActivity(mapIntent)
        }
    }

}
