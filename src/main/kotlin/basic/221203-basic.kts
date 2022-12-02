// Strings

val str = "abc 123"

for (c in str) {
    println(c)
}

println(str.uppercase()) // Create and print a new String object
println(str) // The original string remains the same

val s  = "abc" + 1
println(s + "def")

// String literals
// 소스코드를 컴파일 할 경우 정의되어 있는 내용을 그대로 정확하게 해석할 수 있어야 하는 값
// int x  = 12; x 는 변수, 12 리터럴이다.

// Excape Strings
val sttt = "Hello, World!\n"

val text = """
    for (c in "foo")
      print(c)
""".trimIndent()


println(text)

// String templates
val i = 10
println("i = $i")

println("$sttt.length is ${sttt.length} ")

val price  = """
    ${'$'}_9.99
""".trimIndent()

println(price)







