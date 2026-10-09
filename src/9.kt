import kotlin.math.sqrt

class Vector(val x: Double, val y: Double, val z: Double) {

    fun length(): Double = sqrt(x * x + y * y + z * z)

    infix fun dot(other: Vector): Double =
        x * other.x + y * other.y + z * other.z

    // Перегрузка оператора *
    operator fun times(other: Vector): Double =
        x * other.x + y * other.y + z * other.z
}

// Внешняя функция
fun scalarProduct(v1: Vector, v2: Vector): Double =
    v1.x * v2.x + v1.y * v2.y + v1.z * v2.z

fun main() {
    val v1 = Vector(1.0, 2.0, 3.0)
    val v2 = Vector(3.0, 2.0, 1.0)

    println("Длина v1: ${v1.length()}")
    println("Скалярное (infix): ${v1 dot v2}")
    println("Скалярное (operator *): ${v1 * v2}")
    println("Скалярное (внешняя функция): ${scalarProduct(v1, v2)}")
}