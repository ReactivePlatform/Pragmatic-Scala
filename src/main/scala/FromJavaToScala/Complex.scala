/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
class Complex(val real: Int, val imaginary: Int) {
  def +(operand: Complex) : Complex = {
    new Complex(real + operand.real, imaginary + operand.imaginary)
  }                                                               
  
  override def toString : String = {
    val sign = if(imaginary < 0) "" else "+"
    s"$real$sign${imaginary}i"
  }
}

val c1 = new Complex(1, 2)
val c2 = new Complex(2, -3)
val sum = c1 + c2
println(s"($c1) + ($c2) = $sum") 
