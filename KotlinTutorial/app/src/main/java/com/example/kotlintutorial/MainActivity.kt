package com.example.kotlintutorial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        kotlinTutorial()
    }

    fun kotlinTutorial() {
        Log.i("Info", "Hello World!")

        var name: String
        name = "Guilherme Vendramini";
        println(name)

        var phone: Int = 5500039
        println(phone)

        println("My name is " + name)
        println("My name is $name")
        println("My phone is " + phone)
        println(phone.toString() + " is my phone")

        var year: Int = 2019
        year = 2018
        println("Year: " + year)

        // val cannot be reassigned
        val age: Int = 33
        // age = 35
        println("Age: " + age)

    }
}
