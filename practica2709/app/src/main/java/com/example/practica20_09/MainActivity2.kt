package com.example.practica20_09

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewParent
import android.widget.*

class MainActivity2 : AppCompatActivity() {
    private var lvLenguaje:ListView?=null
    private var tvSeleccion: TextView?=null

    private  val lenguajes = arrayOf("Kotlin","Java","C++","C#","PHP", "VB.net")
    private val posicion = arrayOf("1","6","3","2","4","5")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        lvLenguaje=findViewById(R.lv_Lenguaje)
        tvSeleccion=findViewById(R.id tvSeleccion)

        var adaptador:ArrayAdapter<String> = ArrayAdapter<String>(context = this, R.layout.activity_list_view_app, lvLenguaje?.adapter= adaptador

            lvLenguaje?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{override fun OnItemSelected(

            parent: AdapterView<+>?,
            view: Views?
        position: int,
            id: long


            ){
                tvSeleccion?.text="La posicion del lenguaje" $(lvLenguaje?).getItemAPosition(position)

            override fun onNothingSelected(parent: AdapterView<+>?){

            }
        }
    }
}