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

        println("Player 3 - Weapon name: " + player3.weapon.name)
        println("Player 3 - Weapon damage: " + player3.weapon.damage)

        val axe = Weapon("Axe", 12)
        player2.weapon = axe
        println("Player 2 - Weapon name: " + player2.weapon.name)
        println("Weapon name: " + axe.name)

        player.weapon = Weapon("Gun", 50)
        println("Player 1 - Weapon name: " + player.weapon.name)

        /**
         * Lists
         **/

        val redPortion = Loot("Red Portion", LootType.POTION, 7.50)
        player.inventory.add(redPortion)
        val chestArmor = Loot("Chest Armor", LootType.ARMOR, 80.0)
        player.inventory.add(chestArmor)
        player.inventory.add(Loot("Ring of Protection", LootType.RING, 40.0))


        /**
         * Override func
         **/
        player.showInventory() // See Loot.kt toString() override fun
        println("Override toString fun: " + player.toString())
        println(player.weapon) // See Weapon.kt toString() override fun

        /**
         * Loop
         */
        player.showInventory() // See loop in Loot.kt showInventory() fun

        for (i in 1..10) {
            println("$i squared is ${i * i}")
        }

        for (i in 0 until 10) {
            println("$i squared is ${i * i}")
        }

        for (i in 10 downTo 0) {
            println("$i squared is ${i * i}")
        }

        for (i in 10 downTo 0 step 2) {
            println("$i squared is ${i * i}")
        }

        for (value in 3..100 step 3) {
            if (value % 5 == 0) {
                println(value)
            }
        }
    }

}
