/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
abstract class Writer  {
  def writeMessage(message: String)
}
     
trait UpperCaseWriter extends Writer {
  abstract override def writeMessage(message: String) = 
    super.writeMessage(message.toUpperCase)
}

trait ProfanityFilteredWriter extends Writer {
  abstract override def writeMessage(message: String) = 
    super.writeMessage(message.replace("stupid", "s-----"))
}                 
    
class StringWriterDelegate extends Writer {
  val writer = new java.io.StringWriter
  
  def writeMessage(message: String) = writer.write(message)
  override def toString : String = writer.toString
}

val myWriterProfanityFirst = 
  new StringWriterDelegate with UpperCaseWriter with ProfanityFilteredWriter

val myWriterProfanityLast = 
  new StringWriterDelegate with ProfanityFilteredWriter with UpperCaseWriter

myWriterProfanityFirst writeMessage "There is no sin except stupidity"
myWriterProfanityLast writeMessage "There is no sin except stupidity"

println(myWriterProfanityFirst)
println(myWriterProfanityLast)
