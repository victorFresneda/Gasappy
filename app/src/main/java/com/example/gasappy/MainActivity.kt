package com.example.gasappy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_select_method.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        click_buttton_void()
        click_buttton_cal ()
    }

      fun click_buttton_cal (){
                 butCalConf.setOnClickListener(){
                     val calculationWindow: Intent = Intent(applicationContext, SelectMethod::class.java)
                     startActivity(calculationWindow)
                 }

      }

    fun click_buttton_void (){
                  butVoid.setOnClickListener(){
                      Toast.makeText(applicationContext, " en construccion ", Toast.LENGTH_SHORT).show()
                  }

    }
}
