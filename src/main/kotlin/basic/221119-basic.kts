// Numbers


// Integer types
// Int32 : -2^31 ~ +2^31

val one = 1
val treeBillion = 3000000000// Long
val oneLong = 1L // Long
val oneBytes: Byte = 1

// Floating
val pi = 3.14 // Double
val oneDouble = 1.0 // Double

// float
val e = 2.12f

// no numeric value conversion =
fun printDouble(d: Double) = print(d)

printDouble(1.0)

// Literal constants for number
// decimals : 123
// hexadecimals : 0x0F
// binaries : 0b00001011
val oneMillion = 1_000_000
val creditCardNumber = 1234_1234_1234_1235L
println(creditCardNumber)

// Numbers representation on the JVM
// JVM 에서는 int, double 로 저장
// ? 을 사용하면 Integer, Double 로 Boxing
val a: Int = 100
val boxedA: Int? = a
val anotherBoxedA: Int? = a

val b: Int = 10000
val boxedB: Int? = b
val anotherBoxedB: Int? = b

// JVM 은 -127~128 사이의 Inetger 로 인식해서 Memory 최적화 적용.
println(boxedA === anotherBoxedA)

// 하지만  b 에는 적용안됨.
println(boxedB === anotherBoxedB)

var nullB: Int? = null;

// 객체로서 비교하면 true
println(nullB?.equals(anotherBoxedB))

// Explicit number conversions
// https://kotlinlang.org/docs/numbers.html#explicit-number-conversions

// Hypothetical code, does not actually compile:
//val a: Int? = 1 // A boxed Int (java.lang.Integer)
//val b: Long? = a // Implicit conversion yields a boxed Long (java.lang.Long)
//print (b == a) // Surprise! This prints "false" as Long's equals() checks whether the other is Long as well


val d: Byte = 1 // OK, literal are checked statically
// val i: Int = b // ERROR
val il: Int = d.toInt()

// 값을 유추할 수 있도록한다?
val l = 1L + 3 // Long + Int => Long

// 그렇다면 이것도 되지 않을까?

val s = "" + 2

// s.getClass().getName()
println(s.javaClass.name)

// Operations on numbers

// Division of integers
// 정수를 나누면 정수값이 결과로 나타난다.
val x = 5 / 2
println(x == 2)

//
val y = 5L / 2
println(y == 2L)

val z  = 5 / 2.toDouble()
println(z)

// Floating-point numbers comparison






























