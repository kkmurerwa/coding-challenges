/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        if (head == null) return null

        var returnNode = head
        var current: ListNode = returnNode
        var previous: ListNode? = null
        
        while (current.next != null) {
            println("Value: ${current.`val`}")

            if (current.`val` == `val`) {
                if (previous != null) {
                    previous.next = current.next
                } else {
                    // Edge case 1: Removing first element
                    returnNode = current.next
                }

                current = current.next
            } else {
                previous = current
                current = current.next
            }
        }

        // Edge case 2: Removing last element
        if (current.next == null && current.`val` == `val`) {
            if (previous != null) {
                previous.next = null
            } else {
                return null
            }
        }

        return returnNode
    }
}