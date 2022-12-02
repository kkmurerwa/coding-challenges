class Solution {
    fun validPath(n: Int, edges: Array<IntArray>, source: Int, destination: Int): Boolean {
        // Sol 1: Create a map of <Int, HashSet<>>, then iterate via the map

        // Attempt sol 1
        val map = HashMap<Int, MutableSet<Int>>()
        
        for (edge in edges) {
            if (map.contains(edge[0])) {
                val edgeList = map.get(edge[0])!!
                edgeList.add(edge[1])
            } else {
                map[edge[0]] = mutableSetOf(edge[1])
            }

            if (map.contains(edge[1])) {
                val edgeList = map.get(edge[1])!!
                edgeList.add(edge[0])
            } else {
                map[edge[1]] = mutableSetOf(edge[0])
            }
        }

        // println("Final Map: $map")

        val queue: Queue<Int> = LinkedList()
        queue.add(source)

        val visited = mutableSetOf<Int>()

        while (queue.isNotEmpty()) {
            val currentItem = queue.remove()

            visited.add(currentItem)

            if (currentItem == destination) {
                return true
            } else {
                map[currentItem]?.let { set ->
                    set.forEach { edge ->
                        if (!visited.contains(edge) && !queue.contains(edge)) {
                            queue.add(edge)
                        }
                    }
                }
            }
        }

        return false
    }
}