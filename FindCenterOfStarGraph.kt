class Solution {
    fun findCenter(edges: Array<IntArray>): Int {
        // Sol 1: Create hashmap, then check if one node has n-1 edges
        // Sol 2: Take first three elements, check if one has 2 edges, it's the center

        // Attempt sol 1
        // Original: Time ==> O(n + m), Space ==> O(n + 2m)
        // Optimization 1 ==> O(n + m), Space ==> O(n) + 2 ==> O(n)
        // Optimization 2 ==> O(n), Space ==> O(n)
        
        // Original
        // val map: HashMap<Int, MutableSet<Int>> = HashMap()
        // var visited = mutableSetOf<Int>()

        // for (edge in edges) {
        //     val first = edge[0]
        //     val second = edge[1]

        //     visited.add(first)
        //     visited.add(second)

        //     if (map.contains(first)) {
        //         map.get(first)?.add(second)
        //     } else {
        //         map.put(first, mutableSetOf(second))
        //     }

        //     if (map.contains(second)) {
        //         map.get(second)?.add(first)
        //     } else {
        //         map.put(second, mutableSetOf(first))
        //     }
        // }

        // println("Final Hashmap: $map")

        // for ((key, value) in map) {
        //     if (value.size >= visited.size - 1) {
        //         return key
        //     }
        // }

        // Optimization 1
        // val map: HashMap<Int, Int> = HashMap()

        // for (edge in edges) {
        //     val first = edge[0]
        //     val second = edge[1]

        //     map[first] = (map.get(first)?: 0) + 1
        //     map[second] = (map.get(second)?: 0) + 1
        // }

        // println("Final Hashmap: $map")

        // var max = 0
        // var node = 0

        // for ((key, value) in map) {
        //     if (value > max) {
        //         max = value
        //         node = key
        //     }
        // }

        // return node

        // Optimization 2
        val map: HashMap<Int, Int> = HashMap()

        var max = 0
        var node = 0

        for (edge in edges) {
            val first = edge[0]
            val second = edge[1]

            val newFirstValue = (map.get(first)?: 0) + 1
            val newSecondValue = (map.get(second)?: 0) + 1

            map[first] = newFirstValue
            map[second] = newSecondValue

            if (newFirstValue > max) {
                max = newFirstValue
                node = first
            }

            if (newSecondValue > max) {
                max = newSecondValue
                node = second
            }
        }

        println("Final Hashmap: $map")

        return node
    }
}