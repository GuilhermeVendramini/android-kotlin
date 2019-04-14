package com.example.kotlintutorial

class VampireKing(name: String) : Vampire(name) {
    init {
        hitPoints = 140
    }

    override fun takeDamage(damage: Int) {
        // Super call the parent takeDamage() class in Vampire.kt
        super.takeDamage(damage / 2)
    }
}