package com.example.gasappy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_select_method.*
import kotlinx.android.synthetic.main.activity_select_method.butCalVent
import kotlinx.android.synthetic.main.activity_select_method1.*
import java.text.DecimalFormat

class SelectMethod : AppCompatActivity() {

        var numVol: Float? = null
        var numPow: Float? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_method)






        //Toma las variables del EditText,llama a la función confinementCal al presionar el boton butCalVent
        butCalVent.setOnClickListener {

            numVol = ed_volume.text.toString().toFloat()
            numPow = ed_power.text.toString().toFloat()

            confinementCal(numPow!!, numVol!!)

        }

    }







    //Funcion para determinar si un recinto es confinado o no
    fun confinementCal(power: Float, vol: Float) {

        var confinement: Double = (power) * (3.4)
        var vol = vol


        if (vol >= confinement) {

            Toast.makeText(this, "El recinto no es confinado   (^ 0 ^)  ", Toast.LENGTH_LONG).show()//Muestra mensaje ememrgente

         } else {

             val calculationWindow: Intent = Intent(applicationContext, SelectMethod1::class.java)
              startActivity(calculationWindow)

                  Toast.makeText(this, "El recinto es confinado  (^.^)  ", Toast.LENGTH_LONG).show()//Muestra mensaje ememrgente

               //Exporta la variable confinement a la activity SelectMethod1
               val intent = Intent (this, SelectMethod1 :: class.java)
               val b : Bundle = Bundle()
               val df = DecimalFormat("#.##")// Se utiliza la clase DecimalFormat para mostrar solo 2 digitos por pantalla
                b.putString("power", df.format(confinement).toString())
                  intent.putExtras(b)
                  startActivity(intent)

        }
    }


}