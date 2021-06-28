package com.example.lesson_8_listados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity_listados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listadosFunction()
    }

    private fun listadosFunction(){
        /* las listas son inmutables, no se pueden cambiar los valores*/
        var list1: List<String> = listOf<String>()
        var list2: List<String> = listOf()

        var arraylist: ArrayList<String> = arrayListOf<String>()
        var arraylist2: ArrayList<String> = arrayListOf()

        var listName: List<String> = listOf("Jorge","Laura","Raquel","Juan","Miquel","Andrea")
        var arrayListName: ArrayList<String> = arrayListOf("Jorge","Laura","Raquel","Juan","Miquel","Andrea")
        Log.d("::::", arrayListName.toString())
        /*listName[3] = "pepe" -> da error*/
        arrayListName[2] = "pepe"

        arrayListName.removeAt(2)
        Log.d("::::", arrayListName.toString())
        arrayListName.remove("Andrea")
        Log.d("::::", arrayListName.toString())
        arrayListName.addAll(listName)
        Log.d("::::", arrayListName.toString())

    }
}