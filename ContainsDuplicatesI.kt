class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        // Sol 1: Convert to set, check if same size, return true if not - O(n)
        
        // Sol 2: Nested for loops - O(n^2)
        
        // Sol 3: Sort and check if any number equals its previous - O(n) + O(n log n) == O(n log n)
        
        // Sol 4: Add each element to a hashset and return false if number cannot be added - O(n)
        
        // Attempt sol 4
        val hashSet = HashSet<Int>()
        
        for (item in nums) {
            if (!hashSet.add(item)){
                return true
            }
        }
        
        return false
    }
}