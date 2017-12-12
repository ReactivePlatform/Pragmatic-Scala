/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
// #snip_1
abstract class Writer  {
  def writeMessage(message: String):Unit
}
// #snip_1

// #snip_2
trait UpperCaseWriter extends Writer {
  abstract override def writeMessage(message: String): Unit =
    super.writeMessage(message.toUpperCase)
}

trait ProfanityFilteredWriter extends Writer {
  abstract override def writeMessage(message: String): Unit =
    super.writeMessage(message.replace("stupid", "s-----"))
}
// #snip_2

// #snip_3
class StringWriterDelegate extends Writer {
  val writer = new java.io.StringWriter
  
  def writeMessage(message: String): Unit = writer.write(message)
  override def toString : String = writer.toString
}
// #snip_3

// #snip_4
val myWriterProfanityFirst = 
  new StringWriterDelegate with UpperCaseWriter with ProfanityFilteredWriter

val myWriterProfanityLast = 
  new StringWriterDelegate with ProfanityFilteredWriter with UpperCaseWriter

myWriterProfanityFirst writeMessage "There is no sin except stupidity"
myWriterProfanityLast writeMessage "There is no sin except stupidity"

println(myWriterProfanityFirst)
println(myWriterProfanityLast)
// #snip_4
