open class Vehicle(
    open var speed: Double = 0.0,
    open var name: String = "Транспорт"
) {
    open fun start() {
        println("$name начал движение со скоростью $speed км/ч")
    }
    open fun stop() {
        println("$name остановился")
    }
}

class Boat(speed: Double) : Vehicle(speed, "Лодка")
class Plane(speed: Double) : Vehicle(speed, "Самолет")
class Tank(speed: Double) : Vehicle(speed, "Танк")

fun main() {
    val boat = Boat(30.0)
    val plane = Plane(800.0)
    val tank = Tank(50.0)

    boat.start(); boat.stop()
    plane.start(); plane.stop()
    tank.start(); tank.stop()
}