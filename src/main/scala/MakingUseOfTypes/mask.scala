/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
object UseInterpolator extends App {
  import MyInterpolator._

  val ssn = "123-45-6789"
  val account = "0246781263"
  val balance = 20145.23
  
  println(mask"""Account: $account
    |Social Security Number: $ssn
    |Balance: $$^${balance}
    |Thanks for your business.""".stripMargin)  
}
