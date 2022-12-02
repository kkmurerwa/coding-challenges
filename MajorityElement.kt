class Solution {
    fun majorityElement(nums: IntArray): Int {
        // Sol 1: HashMap and check if any appears more than or equal to half the inputs ==> O(2n)
        // Sol 2: Pick random element (based on chance since it is majority), if not, save in a set and try again ==> O(n)
        // Sol 3: One loop with count and num ==> O(n)

        // Attempt sol 3
        var count = 0
        var majority = 0

        for (num in nums) {
            if (count == 0) {
                count = 1
                majority = num
                continue
            }

            if (majority == num) {
                count ++
            } else {
                count --
            }
        }

        return majority
    }
}