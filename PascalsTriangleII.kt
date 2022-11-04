class Solution {
    fun getRow(rowIndex: Int): List<Int> {
        if (rowIndex == 0) {
            return listOf<Int>(1)
        }
        
        val finalList = mutableListOf<MutableList<Int>>()
        
        for (i in 1..rowIndex+1) {
            val innerList = mutableListOf<Int>()
            
            val previousInnerList = if (finalList.isNotEmpty()) {
                finalList.last()
            } else {
                mutableListOf<Int>()
            }
            
            innerList.add(1)
            
            if (i > 2) {
                for (j in 1..i-2) {
                    innerList.add(previousInnerList[j-1] + previousInnerList[j])  
                }
            }
            
            if (i >= 2) {
                innerList.add(1)
            }
            
            finalList.add(innerList)
        }
        
        return finalList.last()
    }
}