// 🔥 Stage 4: The Enchanted Scroll (Enums & When Statement)

// 💀 Problem: The scroll must cast a spell, but the magic type is missing an Enum case!

enum class MagicType { FIRE, ICE, LIGHTNING }

fun castSpell(type: MagicType) {
    when (type) {
        MagicType.FIRE -> println("🔥 Fireball!")
        MagicType.ICE -> println("❄️ Ice Shard!")
        MagicType.LIGHTNING -> println("⚡️Lightning bolt!")
        // 💣 Missing case for LIGHTNING! Causes compilation error
    }
}

fun main() {
    castSpell(MagicType.LIGHTNING)
}

// 📜 Escape Condition: If you cast the correct spell, you move to Stage 5 (Final Challenge)!