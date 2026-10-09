fun main() {
    val arr = intArrayOf(2, 3, 4, 5, 6)

    // for
    var prod = 1
    for (x in arr) prod *= x
    println("for: произведение = $prod")

    // while
    var p2 = 1; var i = 0
    while (i < arr.size) { p2 *= arr[i]; i++ }
    println("while: произведение = $p2")

    // forEach
    var p3 = 1
    arr.forEach { p3 *= it }
    println("forEach: произведение = $p3")

    // reduce
    println("reduce: произведение = ${arr.reduce { a, b -> a * b }}")

    // min/max
    println("min = ${arr.min()}, max = ${arr.max()}")
}