class Solution {
    // you need treat n as an unsigned value
    fun hammingWeight(n:Int):Int {
        println("N: $n")

        var sum = 0
        var num = n
        while (num != 0) {
            println("Num: $num")
            sum += 1
            println("num and (num - 1) ==> ${num and (num - 1)}")
            num = num and (num - 1)
        }

        return sum
    }
}