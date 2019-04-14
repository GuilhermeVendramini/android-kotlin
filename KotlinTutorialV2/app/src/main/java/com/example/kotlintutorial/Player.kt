package com.example.kotlintutorial

class Player(val name: String, var level: Int = 1) {
    var lives = 3
    var score = 0
    var weapon: Weapon = Weapon("Knife", 1)
    private val inventory = ArrayList<Loot>()

    fun show() {
        if(lives > 1){
            println("$name is alive")
        } else {
            println("$name is dead")
        }
    }

    override fun toString(): String {
        return """
            Name: $name
            Lives: $lives
            Level: $level
            Score: $score
            Weapon: ${weapon.name}
            Damage: ${weapon.damage}
        """
    }

    fun addLoot(item: Loot){
        inventory.add(item)
    }

    fun dropLoot(item: Loot) : Boolean {
        return if (inventory.contains(item)) {
            inventory.remove(item)
            true
        } else {
            false
        }
    }

    fun showInventory(){
        println("$name's Inventory")
        // println(inventory.get(0)) // See Loot.kt toString() override fun
        for (item in inventory) {
            println(item)
        }

    }

}