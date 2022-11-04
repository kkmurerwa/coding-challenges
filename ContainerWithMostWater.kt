class Solution {
    fun maxArea(height: IntArray): Int {
        var max = 0
        
        var left = 0
        var right = height.size - 1
        
        while (left < right) {
            
            val minHeight = Math.min(height[left], height[right])
            val sum = minHeight * (right - left)
            
            max = Math.max(max, sum)
            
            when {
                height[left] < height[right] -> left++
                height[left] > height[right] -> right--
                else -> {
                    left++
                    right--
                }
            }
        }
        
        return max
    }
}