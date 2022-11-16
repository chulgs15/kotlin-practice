// Print to the standard output

println("hello")
println("world")

// Function
//fun sum(a: Int, b: Int): Int {
//    return a + b
//}

fun sum(a: Int, b: Int): Int = a + b

fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

// Variables

val a: Int = 1
val b = 2
var c: Int // var 로 변환하네.
c = 3

val PI = 3.14
var x = 0

fun incrementX() {
    x += 1
}

// Creating classes and instances

class Shape

//class Rectangle(var height: Double, var length: Double) {
//    var perimeter = (height + length) * 2
//}

val rectangle = Rectangle(5.0, 2.0)
println("The perimeter is ${rectangle.perimeter}")


// class 를 상속 받기 위해서는 Open 키워드를 사용해야 한다.
//open class Shape

class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2
}

// String templates

var a3 = 1
val s1 = "a is $a3"
val s2 = "${s1.replace("is", "was")}, but now is $a3"

// Conditional expression
fun maxOf(a: Int, b: Int) = if (a > b) a else b

// for loop
val items = listOf("apple", "banana", "kiwifruit")
for (item in items) {
    println(item)
}

for (index in items.indices) {
    println("item at $index is ${items[index]}")
}

// while loop
var index = 0
while (index < items.size) {
    println("item at $index is ${items[index]}")
    index ++

}

// when expression
fun describe(obj: Any): String =
    when (obj) {
        1 -> "One"
        "hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }

// Ranges
x  = 10;
val y = 9;
if (x in 1..y + 1) {
    println("fits in range")
}

val list = listOf("a", "b", "c")
if (-1 !in 0..list.lastIndex) {
    println("-1 is out of range")
}

// indices = index 의 복수형, 내가 가진 범위를 정리한다.
if (list.size !in list.indices) {
    println("list size is out of valid list indices range, too")
}

for (x in 1..5) {
    println(x)
}

for (x in 1..10 step 2) {
    println(x)
}

println()

for (x in 9 downTo 0 step 3) {
    println(x)
}











