/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
class Car(val year: Int) {
 private var milesDriven: Int = 0
 
 def miles = milesDriven                       
 
 def drive(distance: Int) {
  milesDriven += Math.abs(distance)
 }
}

val car = new Car(2015)
println(s"Car made in year ${car.year}")
println(s"Miles driven ${car.miles}")
println("Drive for 10 miles")
car.drive(10)
println(s"Miles driven ${car.miles}")
