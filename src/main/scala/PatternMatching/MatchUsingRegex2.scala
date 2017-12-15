/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
// #snip_9-25
def process(input : String) {        
  val MatchStock = """^(.+):(\d*\.\d+)""".r
  input match {
    case MatchStock("GOOG", price) => println(s"We got GOOG at $$$price")
    case MatchStock("IBM", price) => println(s"IBM's trading at $$$price")
    case MatchStock(symbol, price) => println(s"Price of $symbol is $$$price")
    case _ => println(s"not processing $input")
  }
}
process("GOOG:310.84")
process("IBM:84.01")
process("GE:15.96")
// #snip_9-25
