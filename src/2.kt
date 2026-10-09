fun main() {
    val numbers = mutableListOf<Int>()
    while (true) {
        val x = readln().toInt()
        if (x == 0) break
        numbers.add(x)
    }
    println("Количество: ${numbers.size}")
    println("Сумма: ${numbers.sum()}")
    println("Среднее арифметическое: ${if (numbers.isEmpty()) 0.0 else numbers.average()}")
}