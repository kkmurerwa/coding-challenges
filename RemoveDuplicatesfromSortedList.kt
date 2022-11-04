fun main() {
    val result = deleteDuplicates(ListNode(1))
}

fun deleteDuplicates(head: ListNode?): ListNode? {
    var ptr = head
    while (ptr != null) {
        while (ptr.next != null && ptr.next!!.`val` == ptr.`val`) {
            ptr.next = ptr.next!!.next
        }
        ptr = ptr.next
    }
    return head
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}