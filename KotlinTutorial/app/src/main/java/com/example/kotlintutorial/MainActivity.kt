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

        /**
         * Variables
         **/

        var name: String
        name = "Guilherme Vendramini";
        println(name)

        var phone: Int = 5500039
        println(phone)

        println("My name is " + name)
        println("My name is $name")
        println("My phone is " + phone)
        println(phone.toString() + " is my phone")

        var year: Int
        year = 2019
        println("Year: " + year)
        year = 2018
        println("Year: " + year)

        // val cannot be reassigned
        val age: Int = 33
        // age = 35
        println("Age: " + age)

        // println("How old are you?")
        // val yourAge = readLine()!!.toInt()
        // println("Age is $yourAge")

        /**
         * Conditions
         **/

        var lives = 2
        var isGameOver = (lives < 1)

        println(isGameOver)

        if (lives < 1) {
            println("Game over!")
        } else if (lives == 2) {
            println("You have 2 lives")
        } else {
            println("You have $lives lives")
        }

        lives = 0
        var message: String
        message = if (lives < 1) {
            "Game over!"
        } else if (lives == 2) {
            "You have 2 lives"
        } else {
            "You have $lives lives"
        }

        println(message)

        lives = 3
        message = when {
            lives < 1 -> "Game over!"
            lives == 2 -> "You have 2 lives"
            else -> "You have $lives lives"
        }

        println(message)

        /**
         * Class
         **/

        val player = Player("Gui")
        println("Player name: " + player.name)
        println("Player lives: " + player.lives)
        println("Player level: " + player.level)
        println("Player score: " + player.score)
        player.show()

        val player2 = Player("Carol")
        player2.level = 10
        player2.show()

        val player3 = Player("Celina", 6)
        player3.show()
    }
}
