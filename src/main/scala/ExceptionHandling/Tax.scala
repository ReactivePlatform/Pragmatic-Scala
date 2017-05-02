/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
object Tax {
  def taxFor(amount: Double) = {
    if (amount < 0) 
       throw new IllegalArgumentException("Amount must be greater than zero")
       
    if (amount < 0.01) 
      throw new RuntimeException("Amount too small to be taxed")
    
    if (amount > 1000000) throw new Exception("Amount too large...")
    
    amount * 0.08
  }
}