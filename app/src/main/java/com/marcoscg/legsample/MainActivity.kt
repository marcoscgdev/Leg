package com.marcoscg.legsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.marcoscg.leg.Leg

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Leg.e("Do not worry, this is not an error.")

        testFunction()

        Leg.i("extra info here", "You can add extra info too.")
    }

    private fun testFunction() {
        Leg.d("Say goodbye to log tags!")
    }
}
