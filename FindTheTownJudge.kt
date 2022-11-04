class Solution {
    fun findJudge(n: Int, trust: Array<IntArray>): Int {   
        // Works but space & time complexity are O(2n) ⋍ O(n)
        var trustMap = HashMap<Int, Int>()
        var trustedMap = HashMap<Int, Int>()
        
        if (n <= 1) return n xor 0
        
        for (i in trust) {
            val key = i[1]
            
            trustedMap.put(key, (trustedMap[key] ?: 0) + 1)
            trustMap.put(i[0], (trustMap[i[0]] ?: 0) + 1)
        }
        
        println("Map: $trustedMap")
        
        for ((key, value) in trustedMap) {
            if (value == n - 1 && (trustMap[key] ?: 0) == 0) {
                return key
            }
        }
        
        return -1
    }
}
