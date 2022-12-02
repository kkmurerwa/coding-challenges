class Solution {
    fun strStr(haystack: String, needle: String): Int {
        // Sol 1: Use kotlin's CharSequence.indexOf() function ==> TC: O(n)
        // Sol 2: Iterate through list, find first char and expand to see if it fits ==> TC: O(m*n)

        // Attempt Sol 1
        return haystack.indexOf(needle)
    }
}