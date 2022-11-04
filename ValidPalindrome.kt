import java.util.*

fun main() {
    val testString = "aabaa"
    val testString2 = "aabbaa"
    val testString3 = "A man, a plan, a canal: Panama"
    val testString4 = "Hello World"

    println("'$testString' is Valid Palindrome: ${isPalindrome(testString)}")
    println("'$testString2' is Valid Palindrome: ${isPalindrome(testString2)}")
    println("'$testString3' is Valid Palindrome: ${isPalindrome(testString3)}")
    println("'$testString4' is Valid Palindrome: ${isPalindrome(testString4)}")
}

fun isPalindrome(s: String): Boolean {
    val withoutSpecialChars = s.replace("[^A-Za-z\\d]".toRegex(), "")

    return withoutSpecialChars.length <= 1 || withoutSpecialChars.reversed().equals(withoutSpecialChars, ignoreCase = true)
}