fun main(args: Array<String>) {

    val outputString = "My name is Kenneth Murerwa"

    // Call extension function
    outputString.fancyOutput()

    // Call inline function
    outputString.inlineFancyOutput(lambdaFunction = { value -> printString(value) } )

    // Call infix function
    val fruit = Fruit()
    fruit type "citric"
    fruit considered "citric"

    // Call infix operator functions
    val h1 = Header("First Header")
    val h2 = Header("Second Header")

    val h3 = h1 plus h2

    println("Header 3: ${h3.name}")

    val h4 = h1 + h2

    println("Header 3: ${h4.name}")

    // Call simple inline function
    simpleCrossInline("Hello") {
        println("Simple cross inline $it")
        return
    }
}

// Extension functions
// Used to extend built-in classes
fun String.fancyOutput() {
    println("*".repeat(40)) // Print n stars
    println(this)
    println("*".repeat(40))
}

// Inline functions
// Same as extension functions but are less expensive to runtime
// Best for methods with lambda functions
fun printString(string: String) {
    println(string)
}

inline fun String.inlineFancyOutput(lambdaFunction: (String) -> Unit) {
    println("*".repeat(40)) // Print n stars
    lambdaFunction("Hello inline functions")
    println("*".repeat(40))
}

// Simple cross inline function
inline fun simpleCrossInline(str : String, func: (String) -> Unit) {
    func(str)
}

// Infix function
class Fruit {
    var fruitType = "citric"

    infix fun type(mType: String): Unit {
        this.fruitType = mType
    }

    infix fun considered(mType: String): Unit {
        println("Is considered $mType? ${this.fruitType == mType}")
    }

}

// Infix operator functions
class Header(val name: String){}

operator infix fun Header.plus(other: Header): Header {
    return Header(this.name + other.name)
}