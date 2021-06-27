package com.example.reto_funciones_l3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

val TAG =":::"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var p1 = programador(programmerData("Jorge",24,"Java"))
        val pData = p1.getProgrammerData()
        Log.d(TAG, pData.toString())
        Log.d(TAG,"Hola soy ${pData.name} tengo ${pData.age} años, soy experto en ${pData.language}" )
    }

    class programador(private val data:programmerData) :programadorInterface{
        override fun getProgrammerData():programmerData{return programmerData(data.name,data.age,data.language)}
        private fun getName():String{return data.name}
        private fun getAge():Int{return data.age}
        private fun getLanguage():String{return data.language}
    }


    interface programadorInterface{fun getProgrammerData():programmerData}


    data class programmerData(
        val name:String,
        val age:Int,
        val language:String
    )
}