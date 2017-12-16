import ExceptionHandling.Tax

/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
// #snip
for (amount <- List(100.0, 0.009, -2.0, 1000001.0)) {
  try {
    print(s"Amount: $$$amount ")
    println(s"Tax: $$${Tax.taxFor(amount)}")
  }
  catch {      
    case ex : IllegalArgumentException => println(ex.getMessage)
    case _ : Throwable => println("Something went wrong")
  }
}
// #snip