class Solution {
    fun isHappy(n: Int): Boolean {
        var num = n
        
        val inLoop = HashSet<Int>();
        var squareSum: Int
        var remain: Int
        
        while (inLoop.add(num)) {
            squareSum = 0
            
            while (num > 0) {
                remain = num % 10
                squareSum += remain*remain
                num /= 10
            }
            
            if (squareSum == 1) return true
            else num = squareSum
        }
        return false;
    }
}