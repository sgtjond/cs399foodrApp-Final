package com.example.cs399app1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_random_resturant_screen.*
import kotlinx.android.synthetic.main.activity_resturant_info_screen.*
import java.util.Random

class RandomResturantScreen : AppCompatActivity()
{
    val rand = Random()

    var thisDraw = 0

    lateinit var thisExtras:Bundle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_resturant_screen)

        if(intent.extras!= null)
        {
            thisExtras = intent.extras
        }

        getRandomRestaurant()

        btnNah.setOnClickListener{
            getRandomRestaurant()
        }

        btnYeah.setOnClickListener{
            val intent = Intent(this, ResturantInfoScreen::class.java)
            intent.putExtra("restaurantName", nameOfRestaurantInfo.text)
            intent.putExtra("cuisineType", cuisineTypeInfo.text)
            intent.putExtra("restaurantImage", thisDraw)
            intent.putExtra("restaurantInfo1", restaurantInfo1Info.text)
            intent.putExtra("restaurantInfo2", restaurantInfo2Info.text)
            Log.d("THISDRAW", thisDraw.toString())
            startActivity(intent)
        }
    }

    private fun getRandomRestaurant()
    {
        val currRand = rand.nextInt(15)
        val context = applicationContext

        when (currRand){
            0 -> {
                if(thisExtras.getBoolean("thaichecked") || thisExtras==null)
                {
                    nameOfRestaurantInfo.text = resources.getString(R.string.darathai)
                    thisDraw = R.drawable.darathai
                    restaurantImageInfo.setImageDrawable(ContextCompat.getDrawable(context, thisDraw))
                    cuisineTypeInfo.text = resources.getString(R.string.thai)
                    restaurantInfo1Info.text = resources.getString(R.string.hours)
                    restaurantInfo2Info.text = resources.getString(R.string.daraaddress)
                    Log.d("THISDRAW", thisDraw.toString())
                }
                else
                {
                    getRandomRestaurant()
                }

            }
            1 -> {
                if(thisExtras.getBoolean("thaichecked") || thisExtras==null) {
                    nameOfRestaurantInfo.text = resources.getString(R.string.swaddeethai)
                    thisDraw = R.drawable.swaddeethai
                    restaurantImageInfo.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            thisDraw
                        )
                    )
                    restaurantInfo1Info.text = resources.getString(R.string.hours)
                    cuisineTypeInfo.text = resources.getString(R.string.thai)
                    restaurantInfo2Info.text = resources.getString(R.string.swaddeeaddress)
                    Log.d("THISDRAW", thisDraw.toString())
                }
                else
                {
                    getRandomRestaurant()
                }
            }
            2 -> {

                if(thisExtras.getBoolean("chinesechecked") || thisExtras==null)
                {
                    nameOfRestaurantInfo.text = resources.getString(R.string.chinastar)
                    thisDraw = R.drawable.chinastar
                    restaurantImageInfo.setImageDrawable(ContextCompat.getDrawable(context, thisDraw))
                    restaurantInfo1Info.text = resources.getString(R.string.hours)
                    cuisineTypeInfo.text = resources.getString(R.string.chinese)
                    restaurantInfo2Info.text = resources.getString(R.string.chinastaraddress)
                    Log.d("THISDRAW", thisDraw.toString())
                }
                else
                {
                    getRandomRestaurant()
                }
            }
            3 -> {
                if(thisExtras.getBoolean("chinesechecked") || thisExtras==null)
                {
                    nameOfRestaurantInfo.text = resources.getString(R.string.pandaexpress)
                    thisDraw = R.drawable.panda
                    restaurantImageInfo.setImageDrawable(ContextCompat.getDrawable(context, thisDraw))
                    restaurantInfo1Info.text = resources.getString(R.string.hours)
                    cuisineTypeInfo.text = resources.getString(R.string.chinese)
                    restaurantInfo2Info.text = resources.getString(R.string.pandaaddress)
                    Log.d("THISDRAW", thisDraw.toString())
                }
                else
                {
                    getRandomRestaurant()
                }
            }
            4 -> {
                if(thisExtras.getBoolean("chinesechecked") || thisExtras==null)
                {
                    nameOfRestaurantInfo.text = resources.getString(R.string.chinagarden)
                    thisDraw = R.drawable.chinagarden
                    restaurantImageInfo.setImageDrawable(ContextCompat.getDrawable(context, thisDraw))
                    restaurantInfo1Info.text = resources.getString(R.string.hours)
                    cuisineTypeInfo.text = resources.getString(R.string.chinese)
                    restaurantInfo2Info.text = resources.getString(R.string.chinagardenaddress)
                    Log.d("THISDRAW", thisDraw.toString())
                }
                else
                {
                    getRandomRestaurant()
                }
            }
            5 -> {
                if(thisExtras.getBoolean("italianchecked") || thisExtras==null)
                {
                    nameOfRestaurantInfo.text = resources.getString(R.string.olivegarden)
                    thisDraw = R.drawable.olivegarden
                    restaurantImageInfo.setImageDrawable(ContextCompat.getDrawable(context, thisDraw))
                    restaurantInfo1Info.text = resources.getString(R.string.hours)
                    cuisineTypeInfo.text = resources.getString(R.string.italian)
                    restaurantInfo2Info.text = resources.getString(R.string.olivegardenaddress)
                    Log.d("THISDRAW", thisDraw.toString())
                }
                else
                {
                    getRandomRestaurant()
                }


            }
            6 -> {
                if(thisExtras.getBoolean("italianchecked") || thisExtras==null)
                {
                    nameOfRestaurantInfo.text = resources.getString(R.string.oreganos)
                    thisDraw = R.drawable.oreganos
                    restaurantImageInfo.setImageDrawable(ContextCompat.getDrawable(context, thisDraw))
                    restaurantInfo1Info.text = resources.getString(R.string.hours)
                    cuisineTypeInfo.text = resources.getString(R.string.italian)
                    restaurantInfo2Info.text = resources.getString(R.string.oreganosaddress)
                    Log.d("THISDRAW", thisDraw.toString())
                }
                else
                {
                    getRandomRestaurant()
                }
            }
            7 -> {
                if(thisExtras.getBoolean("pizzachecked") || thisExtras==null)
                {
                    nameOfRestaurantInfo.text = resources.getString(R.string.nimarcos)
                    thisDraw = R.drawable.nimarcos
                    restaurantImageInfo.setImageDrawable(ContextCompat.getDrawable(context, thisDraw))
                    restaurantInfo1Info.text = resources.getString(R.string.hours)
                    cuisineTypeInfo.text = resources.getString(R.string.pizza)
                    restaurantInfo2Info.text = resources.getString(R.string.nimarcos)
                    Log.d("THISDRAW", thisDraw.toString())
                }
                else
                {
                    getRandomRestaurant()
                }
            }
            8 -> {
                if(thisExtras.getBoolean("pizzachecked") || thisExtras==null)
                {
                    nameOfRestaurantInfo.text = resources.getString(R.string.fratelli)
                    thisDraw = R.drawable.fratelli
                    restaurantImageInfo.setImageDrawable(ContextCompat.getDrawable(context, thisDraw))
                    restaurantInfo1Info.text = resources.getString(R.string.hours)
                    cuisineTypeInfo.text = resources.getString(R.string.pizza)
                    restaurantInfo2Info.text = resources.getString(R.string.fratelliaddress)
                    Log.d("THISDRAW", thisDraw.toString())
                }
                else
                {
                    getRandomRestaurant()
                }
            }
            9 -> {
                if(thisExtras.getBoolean("burgerschecked") || thisExtras==null)
                {
                    nameOfRestaurantInfo.text = resources.getString(R.string.fiveguys)
                    thisDraw = R.drawable.fiveguys
                    restaurantImageInfo.setImageDrawable(ContextCompat.getDrawable(context, thisDraw))
                    restaurantInfo1Info.text = resources.getString(R.string.hours)
                    cuisineTypeInfo.text = resources.getString(R.string.burgers)
                    restaurantInfo2Info.text = resources.getString(R.string.fiveguysaddress)
                    Log.d("THISDRAW", thisDraw.toString())
                }
                else
                {
                    getRandomRestaurant()
                }
            }
            10 -> {
                if(thisExtras.getBoolean("burgerschecked") || thisExtras==null)
                {
                    nameOfRestaurantInfo.text = resources.getString(R.string.habitburger)
                    thisDraw = R.drawable.habit
                    restaurantImageInfo.setImageDrawable(ContextCompat.getDrawable(context, thisDraw))
                    restaurantInfo1Info.text = resources.getString(R.string.hours)
                    cuisineTypeInfo.text = resources.getString(R.string.burgers)
                    restaurantInfo2Info.text = resources.getString(R.string.habitaddress)
                    Log.d("THISDRAW", thisDraw.toString())
                }
                else
                {
                    getRandomRestaurant()
                }
            }
            11 -> {
                if(thisExtras.getBoolean("barbecuechecked") || thisExtras==null)
                {
                    nameOfRestaurantInfo.text = resources.getString(R.string.smokehouse)
                    thisDraw = R.drawable.smokehousebbq
                    restaurantImageInfo.setImageDrawable(ContextCompat.getDrawable(context, thisDraw))
                    restaurantInfo1Info.text = resources.getString(R.string.hours)
                    cuisineTypeInfo.text = resources.getString(R.string.barbeque)
                    restaurantInfo2Info.text = resources.getString(R.string.smokehouseaddress)
                    Log.d("THISDRAW", thisDraw.toString())
                }
                else
                {
                    getRandomRestaurant()
                }
            }
            12 -> {
                if(thisExtras.getBoolean("barbecuechecked") || thisExtras==null)
                {
                    nameOfRestaurantInfo.text = resources.getString(R.string.bigfoot)
                    thisDraw = R.drawable.bigfootbbq
                    restaurantImageInfo.setImageDrawable(ContextCompat.getDrawable(context, thisDraw))
                    restaurantInfo1Info.text = resources.getString(R.string.hours)
                    cuisineTypeInfo.text = resources.getString(R.string.barbeque)
                    restaurantInfo2Info.text = resources.getString(R.string.bigfootbbqaddress)
                    Log.d("THISDRAW", thisDraw.toString())
                }
                else
                {
                    getRandomRestaurant()
                }
            }
            13 -> {
                if(thisExtras.getBoolean("chickenchecked") || thisExtras==null)
                {
                    nameOfRestaurantInfo.text = resources.getString(R.string.canes)
                    thisDraw = R.drawable.canes
                    restaurantImageInfo.setImageDrawable(ContextCompat.getDrawable(context, thisDraw))
                    restaurantInfo1Info.text = resources.getString(R.string.hours)
                    cuisineTypeInfo.text = resources.getString(R.string.chicken)
                    restaurantInfo2Info.text = resources.getString(R.string.canesaddress)
                    Log.d("THISDRAW", thisDraw.toString())
                }
                else
                {
                    getRandomRestaurant()
                }


            }
            14 -> {
                if(thisExtras.getBoolean("chickenchecked") || thisExtras==null)
                {
                    nameOfRestaurantInfo.text = resources.getString(R.string.chick)
                    thisDraw = R.drawable.chickfila
                    restaurantImageInfo.setImageDrawable(ContextCompat.getDrawable(context, thisDraw))
                    restaurantInfo1Info.text = resources.getString(R.string.hours)
                    cuisineTypeInfo.text = resources.getString(R.string.chicken)
                    restaurantInfo2Info.text = resources.getString(R.string.chickaddress)
                    Log.d("THISDRAW", thisDraw.toString())
                }
                else
                {
                    getRandomRestaurant()
                }
            }
            else -> thisDraw = 0
        }
    }
}
