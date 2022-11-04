class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var max = 0
        
        var myList = mutableListOf<Char>()
        
        for (char in s) {
            if (myList.contains(char)) {
                val position = myList.lastIndexOf(char)
                
                max = Math.max(max, myList.size)
                
                myList.removeAll(myList.subList(0, position+1))
            }
            
            myList.add(char)
        }
        
        return Math.max(max, myList.size)
    }
}