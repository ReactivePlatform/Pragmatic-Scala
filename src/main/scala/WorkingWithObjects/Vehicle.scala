/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
class Vehicle(val id: Int, val year: Int) {               
  override def toString = s"ID: $id Year: $year"
}

class Car(override val id: Int, override val year: Int, var fuelLevel: Int) 
  extends Vehicle(id, year) {                             
  override def toString = s"${super.toString} Fuel Level: $fuelLevel"
}

val car = new Car(1, 2015, 100)
println(car)
