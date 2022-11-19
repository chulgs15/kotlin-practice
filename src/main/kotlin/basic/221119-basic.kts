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

// https://kotlinlang.org/docs/numbers.html#explicit-number-conversions



