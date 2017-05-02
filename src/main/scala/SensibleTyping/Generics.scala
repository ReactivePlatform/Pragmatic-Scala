/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
import java.util._

var list1 : List[Int] = new ArrayList[Int]
var list2 = new ArrayList[Int]

list2 add 1              
list2 add 2              

var total = 0
for (val index <- 0 until list2.size()) {
  total += list2.get(index)  
}                      

println("Total is " + total)
