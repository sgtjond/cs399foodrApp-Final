package com.example.cs399app1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_parameters_screen.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val thisIntent = intent.extras

        btnSetParameters.setOnClickListener{
            val intent = Intent(this, ParametersScreen::class.java)
            startActivity(intent)
        }

        btnHelp.setOnClickListener{
            val intent = Intent(this, RandomResturantScreen::class.java)

            if(thisIntent!=null)
            {
                intent.putExtra("thaichecked", thisIntent.getBoolean("thaichecked"))
                intent.putExtra("chinesechecked", thisIntent.getBoolean("chinesechecked"))
                intent.putExtra("italianchecked", thisIntent.getBoolean("italianchecked"))
                intent.putExtra("americanchecked", thisIntent.getBoolean("americanchecked"))
                intent.putExtra("pizzachecked", thisIntent.getBoolean("pizzachecked"))
                intent.putExtra("burgerschecked", thisIntent.getBoolean("burgerschecked"))
                intent.putExtra("barbecuechecked", thisIntent.getBoolean("barbecuechecked"))
                intent.putExtra("chickenchecked", thisIntent.getBoolean("chickenchecked"))
            }

            startActivity(intent)
        }
    }
}
