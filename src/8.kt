class ArrayProcessor(private val arr: IntArray) {
    fun sumPositive(): Int = arr.filter { it > 0 }.sum()
    fun product(): Int = arr.fold(1) { acc, x -> acc * x }
    fun average(): Double = arr.average()
}

fun main() {
    val obj = ArrayProcessor(intArrayOf(1, -2, 3, -4, 5))
    println("Сумма положительных: ${obj.sumPositive()}")
    println("Произведение: ${obj.product()}")
    println("Среднее: ${obj.average()}")
}