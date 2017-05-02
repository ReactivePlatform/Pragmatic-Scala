/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
package automobiles 

class Vehicle {
  protected def checkEngine() {}
}
class Car extends Vehicle {
  def start() { checkEngine() /*OK*/ }
  def tow(car: Car) {
    car.checkEngine() //OK
  }    
  def tow(vehicle: Vehicle) {
    vehicle.checkEngine() //ERROR       
  }
}
class GasStation {
  def fillGas(vehicle: Vehicle) {
    vehicle.checkEngine() //ERROR    
  }
}
