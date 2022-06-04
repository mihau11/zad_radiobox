package com.example.zadanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val show = findViewById<Button>(R.id.show_btn);
        val unblck = findViewById<Button>(R.id.odblokuj)
        val wiek =  findViewById<EditText>(R.id.wiek).toString().toInt()

        val pchlop = findViewById<RadioButton>(R.id.chlop)
        val pbaba = findViewById<RadioButton>(R.id.baba)
        val siata = findViewById<CheckBox>(R.id.siata)
        val plyw = findViewById<CheckBox>(R.id.plyn)
        val gala = findViewById<CheckBox>(R.id.gala)
        val bieg = findViewById<CheckBox>(R.id.bieg)
        var wyniki = findViewById<TextView>(R.id.Wyniki)


        show.setOnClickListener{
            //Płeć
            if (pchlop.isChecked){
                wyniki.append("męzczycna\n")

            }
            if (pbaba.isChecked){
                wyniki.append("Kobieta\n")
            }
            //wiek
            wyniki.append(wiek.toString()+"Lat\n")
            wyniki.append("Sport:\n")
            if (plyw.isChecked){
                wyniki.append("-pływanie\n")
            }
            if (gala.isChecked){
                wyniki.append("-piłka nożna\n")
            }
            if (bieg.isChecked){
                wyniki.append("-bieganie\n")
            }
            if (siata.isChecked){
                wyniki.append("-siatkówka\n")
            }



            //Blokowanie

            pbaba.isEnabled = false
            pchlop.isEnabled = false
            //wiek.isEnabled = false
            bieg.isEnabled = false
            plyw.isEnabled = false
            siata.isEnabled = false
            gala .isEnabled = false



        }

        unblck.setOnClickListener {
            pbaba.isEnabled = true
            pchlop.isEnabled = true
            findViewById<EditText>(R.id.wiek).isEnabled = true
            bieg.isEnabled = true
            siata.isEnabled = true
            gala.isEnabled = true
            plyw.isEnabled = true

        }
    }
}