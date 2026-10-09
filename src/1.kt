fun main() {
    println("Введите целое положительное число:")
    val input = readln()
    val first = input.first().digitToInt()
    val last = input.last().digitToInt()
    println("Сумма первой и последней цифры: ${first + last}")
}