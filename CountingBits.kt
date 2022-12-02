class Solution {
    fun countBits(n: Int): IntArray {
        // Sol 1: Nested loops
        // Sol 2: Single pass

        // Attempt sol 2
        val list = mutableListOf<Int>()

        for (i in 0..n) {
            if (i == 0) {
                list.add(0)
            } else {
                list.add(list[i shr 1] + (i and 1))
            }   
        }

        println("List: $list")

        return list.toIntArray()
    }
}