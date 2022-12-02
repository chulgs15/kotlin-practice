// Boolean

/*
 work lazy
 */

val myTrue: Boolean = true
val myFalse: Boolean = false
val boolNull: Boolean? = null

println(myTrue || myFalse)
println(myTrue && myFalse)

if (boolNull == true) {
    println("boolNull is true")
}

if (boolNull == null) {
    println("boolNull is null")
}

if (boolNull == false) {
    println("boolNull is false")
}

// Character

val aChar: Char = 'a'
println(aChar)
println('\n')
println('\uFF00')

println('1'.digitToInt().javaClass.name)
