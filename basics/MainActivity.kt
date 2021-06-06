package com.example.actividad_lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    val TAG = ":::::TAG"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Comment line -> "//", Comment Block -> "/* whatEver */"
        //for change the keymap for Comment Block -> preferences/keymap/mainMenu/code/folding
        //and change the key shortcuts
        variablesAndConstants()
        typeVariables()
        operadores()
        nullSafety()
    }
    private fun variablesAndConstants(){
        var hello ="Hello world!!"
//        For print text in the Terminal use "Log.d()"
        Log.d(TAG,hello)
    }
    private fun typeVariables(){
        //tipos de datos en kotlin
        //Strings
        var String ="what ever"
        //Variables numbers (int,short,long,byte)
        var num = 100
        String = num.toString()
        Log.d(TAG,String)
        var num2: Long = 2333
        //numbers decimals (double, float)
        var numDecimal: Double= 44.55
        var numFloat = 55.55F
        //Booleans
        var t = true
        var f = false

    }
    private fun operadores(){
        //NO CAMBIA PRACTICAMENTE NADA RESPECTO A OTROS LENGUAJES
        var v1 = 5.0
        var v2 = 2.0
        //Operadores aritmeticos
        var suma = v1 + v2
        Log.d(TAG,"La suma es $suma")
        suma = v1 - v2
        Log.d(TAG,"La resta es $suma")
        suma = v1 * v2
        Log.d(TAG,"El modulo es $suma")
        suma = v1 / v2
        Log.d(TAG,"La division es $suma")
        suma = v1 % v2
        Log.d(TAG,"El resto es $suma")
        //Operadores de comparacion
        var iguales = v1 == v2
        Log.d(TAG,"El resultado es $iguales")
        iguales = v1 != v2
        Log.d(TAG,"El resultado es $iguales")
        iguales = v1 >= v2
        Log.d(TAG,"El resultado es $iguales")
        iguales = v1 <= v2
        Log.d(TAG,"El resultado es $iguales")
        //Operadores Logicos (&&, ||)
        var logico = v1 < 10 && v2 >0
        Log.d(TAG,"El resultado es $logico")
        logico = v1 < 10 || v2 >0
        Log.d(TAG,"El resultado es $logico")
    }
    private fun nullSafety(){
        //declaramos que puede ser null con "?" al final
        val c1:String? = null
        if (c1 != null)
            Log.d(TAG,c1)
        else
            Log.d(TAG,"La variable es null")
        //o tambien lo podemos usar de esat forma
        c1?.let { Log.d(TAG,"El valor no es nullo $c1") }
            //usamos "!!" para obligar a que lo haga, da error
            ?: run { Log.d(TAG, c1!!) }
    }
}