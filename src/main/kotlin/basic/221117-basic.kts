// Collection
val items = listOf("car", "house", "cellphone")

for (item in items) {
    println(item)
}

when {
    "orange" in items -> println("juicy")
    "apple" in items -> println("apple is fine too")
}

val fruits = listOf("banana", "avocado", "apple", "kiwifruit")

fruits.filter { it.startsWith("a") }
    .sortedBy { it }
    .map { it.uppercase() }
    .forEach { println(it) }

// Nullable values and null checks

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x != null && y != null) {
        println(x * y)
    } else {
        println("'$arg1' or '$arg2' is not a number")
    }
}

printProduct("6", "7")
printProduct("a", "7")

// Type checks and automatic casts


fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }

    return null
}

fun getStringLength2(obj: Any): Int? {
    if (obj !is String) return null

    // obj 가 자동으로 'String' 으로 변환
    return obj.length
}

fun getStringLength3(obj: Any): Int? {
    if (obj is String && obj.length > 0) {
        return obj.length
    }

    return null;
}

