package com.example.kotlintutorial

class Weapon(val name: String, var damage: Int) {
    override fun toString(): String {
        return "$name inflicts $damage points of damage."
    }
}