package com.example.gasappy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_select_method.*
import kotlinx.android.synthetic.main.activity_select_method1.*
import kotlinx.android.synthetic.main.activity_select_method2.*
import java.text.DecimalFormat


class SelectMethod1 : AppCompatActivity() {



    var prueba:SelectMethod = SelectMethod()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_method1)






        //Recibe la variable confinement de la Activity SelectMethod, y la muestra en el textView txtKwRequired
        var bundle = intent.extras
        if (bundle != null) {
            txtKwRequired.text = bundle.getString("power")
        }

        butMet1.setOnClickListener {

            val calculationWindow: Intent = Intent(applicationContext, SelectMethod2::class.java)
            startActivity(calculationWindow)

            multp ()

        }



    }

    fun  multp (){

        var volReq: Int = 10 * 6


        //Exporta la variable confinement a la activity SelectMethod1
        val intent = Intent (this, SelectMethod2 :: class.java)
        val b : Bundle = Bundle()
        val df = DecimalFormat("#.##")// Se utiliza la clase DecimalFormat para mostrar solo 2 digitos por pantalla
        b.putString("power2", df.format(volReq).toString())
        intent.putExtras(b)
        startActivity(intent)
    }

}
