package com.example.cs399app1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_parameters_screen.*

class ParametersScreen : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parameters_screen)

        parametersBack.setOnClickListener{
           val intent = Intent(this, MainActivity::class.java)
           intent.putExtra("thaichecked", thaicheck.isChecked)
           intent.putExtra("chinesechecked", chinesecheck.isChecked)
           intent.putExtra("italianchecked", italiancheck.isChecked)
           intent.putExtra("americanchecked", americancheck.isChecked)
           intent.putExtra("pizzachecked", pizzacheck.isChecked)
           intent.putExtra("burgerschecked", burgercheck.isChecked)
           intent.putExtra("barbecuechecked", barbecuecheck.isChecked)
           intent.putExtra("chickenchecked", chickencheck.isChecked)
           startActivity(intent)
        }
    }
}