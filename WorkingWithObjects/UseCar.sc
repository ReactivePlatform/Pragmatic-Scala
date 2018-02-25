class Car(val year: Int) {
  private var milesDriven: Int = 0

  def miles: Int = milesDriven

  def drive(distance: Int): Unit = {
    milesDriven += Math.abs(distance)
  }
}
val car = new Car(2015)
println(s"Car made in year ${car.year}")
println(s"Miles driven ${car.miles}")
println("Drive for 10 miles")
car.drive(10)
println(s"Miles driven ${car.miles}")
