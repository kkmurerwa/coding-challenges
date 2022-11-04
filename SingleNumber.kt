class Solution {
    fun singleNumber(nums: IntArray): Int {
        // Bitwise XOR solution
        var result = 0
        
        for (num in nums) {
            println("$result xor $num = ${result xor num}")
            
            result = result xor num
        }
        
        return result
        
        // Loop solution
        val uniqueNumbers = mutableListOf<Int>()
        
        for (num in nums) {
            if (uniqueNumbers.contains(num)) {
                uniqueNumbers.remove(num)
            } else {
                uniqueNumbers.add(num)
            }
        }
        
        println("Unique Numbers: $uniqueNumbers")
        
        return uniqueNumbers[0]
    }
}