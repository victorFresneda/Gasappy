package com.example.gasappy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_select_method.*
import kotlinx.android.synthetic.main.activity_select_method1.*

class SelectMethod1 : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_method1)

        //Recibe la variable confinement de la Activity SelectMethod, y la muestra en el textView txtKwRequired
        var bundle = intent.extras
        if (bundle != null) {
            txtKwRequired.text = bundle.getString("power")



        }


    }


}
