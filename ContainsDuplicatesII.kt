class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        // Sol 1: Two for loops
        // Sol 2: Hashset 
        
        // Attempt sol 2
        val hashSet = HashSet<Int>()
        
        for (i in nums.indices) {
            if (i > k) hashSet.remove(nums[i-k-1])
            if (!hashSet.add(nums[i])) {
                return true
            }
        }
        
        return false
    }
}