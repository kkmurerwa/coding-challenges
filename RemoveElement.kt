class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var count = 0
        
        for (i in nums) {
            if (i != `val`) {
                nums[count] = i
                count++
            }
        }
        
        return count
    }
}