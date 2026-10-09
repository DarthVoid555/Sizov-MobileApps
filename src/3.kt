fun main() {
    val a = (0..10).random()
    while (true) {
        println("Введите число от 0 до 10:")
        val b = readln().toInt()
        when {
            b > a -> println("Много")
            b < a -> println("Мало")
            else -> { println("Угадал"); break }
        }
    }
}