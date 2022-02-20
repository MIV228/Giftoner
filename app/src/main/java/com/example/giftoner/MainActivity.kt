package com.example.giftoner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var CouseHome = 0

        val text1 = findViewById<TextView>(R.id.text1)
        text1.text = "кому подарок?"

        val buttonMan = findViewById<Button>(R.id.buttonMan)
        val buttonWoman = findViewById<Button>(R.id.buttonWoman)
        val buttonBoy = findViewById<Button>(R.id.buttonBoy)
        val buttonGirl = findViewById<Button>(R.id.buttinGirl)

        if (CouseHome == 0)
        {
            buttonMan.setOnClickListener { CouseHome = 1 }
            buttonWoman.setOnClickListener { CouseHome = 2 }
            buttonBoy.setOnClickListener { CouseHome = 3 }
            buttonGirl.setOnClickListener { CouseHome = 4 }
        }

        if (CouseHome != 0) {
            text1.text = "укажите возраст"
        }





    }


}