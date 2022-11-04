class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var toAdd = 1
        val finalArray = mutableListOf<Int>()
        
        for (i in digits.size - 1 downTo 0) {
            val sum = digits[i] + toAdd
            
            val value = sum % 10
            finalArray.add(value)
            
            toAdd = sum / 10
        }
        
        if (toAdd != 0) {
            finalArray.add(toAdd)
        }
        
        return finalArray.reversed().toIntArray()
    }
}