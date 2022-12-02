class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var index2 = 0
        
        // Sol 1: Merge list 2 into 1 as-is then sort ==> O(n log n) + O(n)
        // Sol 2: Marge from last elements ==> O(n + m)
        
        // Attempt Sol 2
        var ptr1 = m - 1
        var ptr2 = n - 1
        var insertAt = m + n - 1

        while (insertAt >= 0) {
            if (ptr2 < 0 && ptr1 < 0) {
                break;
            } else if (ptr1 < 0) {
                nums1[insertAt] = nums2[ptr2]
                ptr2--
            } else if (ptr2 < 0) {
                nums1[insertAt] = nums1[ptr1]
                ptr1--
            } else {
                val num1 = nums1[ptr1]
                val num2 = nums2[ptr2]

                if (num1 < num2) {
                    nums1[insertAt] = num2
                    ptr2--
                } else {
                    nums1[insertAt] = num1
                    ptr1--
                }
            }

            insertAt--
        }
    }
}