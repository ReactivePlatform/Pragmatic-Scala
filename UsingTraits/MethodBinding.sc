abstract class Writer {
  def writeMessage(message: String): Unit
}
trait UpperCaseWriter extends Writer {
  abstract override def writeMessage(message: String): Unit =
    super.writeMessage(message.toUpperCase)
}

trait ProfanityFilteredWriter extends Writer {
  abstract override def writeMessage(message: String): Unit =
    super.writeMessage(message.replace("stupid", "s-----"))
}
class StringWriterDelegate extends Writer {
  val writer = new java.io.StringWriter

  def writeMessage(message: String): Unit = writer.write(message)
  override def toString: String = writer.toString
}
val myWriterProfanityFirst =
  new StringWriterDelegate with UpperCaseWriter with ProfanityFilteredWriter

val myWriterProfanityLast =
  new StringWriterDelegate with ProfanityFilteredWriter with UpperCaseWriter

myWriterProfanityFirst writeMessage "There is no sin except stupidity"
myWriterProfanityLast writeMessage "There is no sin except stupidity"

println(myWriterProfanityFirst)
println(myWriterProfanityLast)
