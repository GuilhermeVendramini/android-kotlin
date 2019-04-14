package com.example.kotlintutorial

open class Vampire(name: String): Enemy(name, 30, 2) {
    override fun takeDamage(damage: Int) {
        // Super call the parent takeDamage() class in Enemy.kt
        super.takeDamage(damage / 2)
    }
}