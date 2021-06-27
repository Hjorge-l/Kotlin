package com.example.reto_funciones_l3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var programmer1 = programmerData("Jorge",24,"Java")
        val prog = programador(programmer1)
        prog.getProgrammerData()
        Log.d(":::::", prog.getProgrammerData().toString())
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