import java.util.*

fun main() {
    val isValid = isValid("([)]")

    println("Is Valid: $isValid")
}

fun isValid(s: String): Boolean {
    val stack = Stack<Char>()

    if (s.isEmpty() || s[0] == ']' || s[0] == ')' || s[0] == '}' || s.length % 2 == 1) return false

    for (i in s.indices) {

        when (val current = s[i]) {
            '(' -> stack.push(')')
            '[' -> stack.push(']')
            '{' -> stack.push('}')
            else -> {
                if (stack.isEmpty() || stack.pop() != current) return false
            }
        }
    }

    return stack.isEmpty()
}