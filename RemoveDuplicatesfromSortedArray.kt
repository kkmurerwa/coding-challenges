fun main() {

    val testIntArray = listOf(1, 1, 2).toIntArray()

    val sizeOfNonDuplicatedList = removeDuplicates(testIntArray)

    println("Size Returned: $sizeOfNonDuplicatedList")
}

fun removeDuplicates(nums: IntArray): Int {
    println("Nums: ${nums.toList()}")

    var count = 0

    nums.forEachIndexed { index, num ->
        if (index == 0 || nums.indexOf(num) == index) {
            nums[count] = nums[index]
            count++
        }
    }

    println("Nums Updated: ${nums.toList()}")

    return count
}