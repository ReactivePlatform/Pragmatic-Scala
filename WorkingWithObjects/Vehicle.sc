class Vehicle(val id: Int, val year: Int) {
  override def toString = s"ID: $id Year: $year"
}

class Car(override val id: Int, override val year: Int, var fuelLevel: Int)
  extends Vehicle(id, year) {
  override def toString = s"${super.toString} Fuel Level: $fuelLevel"
}

val car = new Car(1, 2015, 100)
println(car)
