/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
class OrderItem(val title: String, var quantity: Int) {                                        
  override def toString : String = "Title " + title + ", Quantity " + quantity
}

object OrderItem {
  def apply(title: String, quantity: Int) = new OrderItem(title, quantity)
}
              
val item1 = new OrderItem("The Art of Computer Programming", 1)

var item2 = OrderItem("The Pragmatic Programmer", 1)

OrderItem.apply("The Pragmatic Programmer", 1)
              
println(item1)
println(item2)
