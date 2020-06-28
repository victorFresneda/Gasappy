package com.example.gasappy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_select_method2.*

class SelectMethod2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_method2)



        //Recibe la variable confinement de la Activity SelectMethod, y la muestra en el textView txtKwRequired
        var bundle = intent.extras
        if (bundle != null) {
            textView9.text = bundle.getString("power2")
            textView12.text = bundle.getString("power2")
        }
    }
}
