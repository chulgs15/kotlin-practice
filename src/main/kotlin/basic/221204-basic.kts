import java.util.*

// Array

val asc = arrayOf(1,2,3)

// 아 비어 있는 Array를 만들때 사용하는 구나.
val asc2 = arrayOfNulls<Int>(3)

val asc3 = Array(5) { i -> (i * 1).toString()}
asc3.forEach { println(it) }

// 불변 객체이기 때문에 상위 클래스로 변수 할당 불가.
// Array<String> => Array<Any>

// Primitive type Arrays

val x: IntArray = intArrayOf(1, 2, 3)
x[0] = x[1] + x[2]

// Array of int of size 5 with values [0, 0, 0, 0, 0]
var arr = IntArray(5)
println(Arrays.toString(arr))

// 선언시 초기화 변수 설정
arr = IntArray(5) {42}
println(Arrays.toString(arr))

// 람다 활용
// it 가 index 로 활용된다.
arr = IntArray(5) { it * 1 }
println(Arrays.toString(arr))








