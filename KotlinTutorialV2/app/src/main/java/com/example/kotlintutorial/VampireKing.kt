package com.example.kotlintutorial

import java.util.*

class VampireKing(name: String) : Vampire(name) {
    init {
        hitPoints = 140
    }

    override fun takeDamage(damage: Int) {
        // Super call the parent takeDamage() class in Vampire.kt
        super.takeDamage(damage / 2)
    }

    fun dodges(): Boolean {
        val rand = Random()
        val chance = rand.nextInt(6)
        if (chance > 3) {
            println("$name dodges.")
            return true
        }
        return false
    }
}