/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
// #snip_9-24
def process(input : String) {        
  val GoogStock = """^GOOG:(\d*\.\d+)""".r
  input match {
    case GoogStock(price) => println(s"Price of GOOG is $$$price")
    case _ => println(s"not processing $input")
  }
}
process("GOOG:310.84")
process("GOOG:310")
process("IBM:84.01")
// #snip_9-24
