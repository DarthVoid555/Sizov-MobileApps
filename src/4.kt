fun isPrime(x: Int): Boolean {
    if (x < 2) return false
    for (i in 2..kotlin.math.sqrt(x.toDouble()).toInt()) {
        if (x % i == 0) return false
    }
    return true
}

fun main() {
    println("Сколько простых чисел вывести?")
    val n = readln().toInt()
    var count = 0
    var num = 2
    while (count < n) {
        if (isPrime(num)) {
            count++
            println("$count-ое число: $num")
        }
        num++
    }
}