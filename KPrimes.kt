import java.util.*

fun primeFactorsOfNumber(num: Int) : MutableList<Int> {
    val factors = mutableListOf<Int>()
    if (num < 1) 
    	return factors
    (1..num)
        .filter { num % it == 0 }
        .filter { it % 2 == 1 || it == 2 }
        .filter { isPrime(it) }
        .forEach { factors.add(it) }
        
    println("Prime factors of $num are ${factors}")

    return factors
}

fun allFactorsOfNumber(num: Int) : MutableList<Int> {
    val factors = mutableListOf<Int>()
    if (num < 1)
        return factors
    (1..num)
        .filter { num % it == 0 }
        .forEach { factors.add(it) }

    println("Prime factors of $num are ${factors}")

    return factors
}

fun isPrime(n: Int): Boolean {
    return n == 2 || Math.pow(2.toDouble(), (n-1).toDouble()).toInt() % n == 1
}

fun countKprimes(k:Int, start:Long, end:Long) {
    var kprimes = mutableListOf<Long>()
    
    for (i in start..end) {
        val primes = primeFactorsOfNumber(i.toInt()).size
        
        if (primes == k) {
            kprimes.add(i)
        }
    }
    
    println(kprimes)
}

fun main() {
    val number = 24
    
//    countKprimes(2, 0, 30)

    println("All Factors of $number are ${allFactorsOfNumber(number)}")
}
