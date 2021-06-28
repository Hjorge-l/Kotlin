package com.example.condicional_if

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

val TAG = ":::"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        condicionalesIF(3,5)
        condicionalesIF(5,4)
        condicionalesIf2()
        condicional3(5,5)
        condicional3(1,3)
    }

    private fun condicionalesIF(num1:Int,num2:Int){
        if (num1 < num2)
            Log.d(TAG,"$num1 es menor que $num2")
        else
            Log.d(TAG,"$num1 es mayor que $num2")
    }

    private fun condicionalesIf2(){
        var booleanValue: Boolean = true
        if (booleanValue)
            Log.d(TAG,"El valor es true")
        else
            Log.d(TAG,"El valor es false")

        if (!booleanValue)
            Log.d(TAG,"El valor es true")
        else
            Log.d(TAG,"El valor es false")
    }
    
    private fun condicional3(num1:Int,num2:Int){
        var valor = if(num1 == num2) "son iguales" else "no son iguales"
        Log.d(TAG,valor)
    }
}