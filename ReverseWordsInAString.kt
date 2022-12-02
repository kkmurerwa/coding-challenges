class Solution {
    fun reverseWords(s: String): String {
        // Assumptions
        // No space limit
        // No time limit

        // Sol 1: Convert words to word list, reverse, join with string ==> TC = O(3n), SC = O(1)
        // Sol 2: Convert words to word list, add to stack, join to string ==> TC = O(3n), SC = O(1)
        // Sol 3: Iterate through the string, divide words by spaces, join to string immediately ==> TC = O(n)

        // Attempt Sol 1:

        // Sanitize input
        val regex = "[\\s]+".toRegex()

        val splitted = s.trim().split(regex)

        val reversed = splitted.reversed() // Would be better to make a custom implementation here

        return reversed.joinToString(" ")
    }
}