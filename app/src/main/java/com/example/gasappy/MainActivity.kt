package com.example.gasappy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        click_buttton_cal()
    }

      fun click_buttton_cal (){
                 butCal.setOnClickListener(){
                     Toast.makeText(applicationContext, " boton funciona ", Toast.LENGTH_SHORT).show()
                 }

      }
}
