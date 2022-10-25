package com.example.practica20_09

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        claseAnidadasyInternas()
    }
    private fun claseAnidadasyInternas(){
        //clase anidad (nested class)
        val miClaseAnidada = miClaseAnidadayInterna.miClaseAnidada()
        val sumarDosNum = miClaseAnidada.suma(n1; 5, n2 ;6)
        println("El resultado de la suma es $sumarDosNum")

    //clase interna

        val miClaseInterna1 = miClaseAnidadayInterna().miClaseInterna()
        val sumarDos = miClaseInterna1.sumarDos (num 3)
        println("El resultado de la suma dos es $sumarDos")


    }
}