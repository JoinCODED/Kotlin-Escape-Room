// 🏹 Stage 3: The Magic Chest (Loops & Collections)

// 💀 Problem: The magic chest contains duplicate treasures, but it must only return unique items.

fun main() {
    val chest = mutableSetOf("Gold", "Silver", "Gold", "Diamond", "Silver")
    var uniqueLoot = mutableSetOf<String>()

    for (item in chest) {
        if (!uniqueLoot.contains(item)) {
            uniqueLoot.add(item)  // 💣 Error: listOf() creates an immutable list
        }
    }
    println("Loot: $uniqueLoot")
    val sortedLoot = chest.toSortedSet()

    println("Loot: $sortedLoot")

}

// 🥤 Escape Condition: If you remove duplicates successfully, you move to Stage 4.