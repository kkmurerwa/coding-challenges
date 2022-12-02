class Solution {
    fun longestPalindrome(s: String): String {
        // Sol 1: Nested loops ==> TC: O(n^3)
        // Sol 2: Single pass with while loop, take number, check if another partner exists, check if palindrome, check if longest ==> TC: O(n^3)
        // Sol 3: Check and expand from center ==> TC: O(n^2)

        // Attempt Sol 3
        var longest = ""

        for (i in 0..s.length) {
            var left = i
            var right = i

            // Check for odd length
            while (left >= 0 && right < s.length && s[left] == s[right]) {
                if (right - left > longest.length - 1) {
                    longest = s.substring(left, right+1)
                }

                right++
                left--
            }

            left = i
            right = i + 1
            // Check for even length
            while (left >= 0 && right < s.length && s[left] == s[right]) {
                if (right - left > longest.length - 1) {
                    longest = s.substring(left, right+1)
                }

                right++
                left--
            }
        }

        return longest
    }
}