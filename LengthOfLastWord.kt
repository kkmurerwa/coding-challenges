fun main() {
    val length = lengthOfLastWord("   fly me   to   the moon  ")

    println("Length of last word: $length")
}

fun lengthOfLastWord(s: String): Int {
    return s.replace("\\s+".toRegex(), " ")
        .split(" ")
        .last {
            it.isNotEmpty()
        }.length
}