package com.example.condicional_when

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

var TAG = ":::"

class MainActivityWhen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        conditionalWhen1("hola")
        conditionalWhen1("kotlin")
        conditionalWhen2(5)
        conditionalWhen2(25)
    }

    private fun conditionalWhen1(language:String){
        when (language){
            "kotlin", "scala" -> Log.d(TAG,"Se ha seleccionado kotlin")
            "java"-> Log.d(TAG,"Se ha seleccionado kotlin")
            "python"-> Log.d(TAG,"Se ha seleccionado kotlin")
            "C"-> Log.d(TAG,"Se ha seleccionado kotlin")
            else -> Log.d(TAG,"se ha seleccionado otro lenguage")
        }
    }
    private fun conditionalWhen2(number : Int){
        when (number){
            in 0..10 -> Log.d(TAG,"Se ha seleccionado $number")
            16 -> Log.d(TAG,"Se ha seleccionado $number")
            in 20..40 -> Log.d(TAG,"Se ha seleccionado $number")
            60 -> Log.d(TAG,"Se ha seleccionado $number")
            else -> Log.d(TAG,"se ha seleccionado otro $number")
        }
    }
}