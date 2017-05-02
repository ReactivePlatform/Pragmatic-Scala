/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
package automobiles

class Car(val year: Int) {                      
  private[this] var miles : Int = 0
  
  def drive(distance: Int) { miles += distance }                  
  
  override def toString : String = s"year: $year miles: $miles"
}
