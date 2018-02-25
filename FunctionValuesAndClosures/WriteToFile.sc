import java.io._

def writeToFile(fileName: String)(codeBlock: PrintWriter ⇒ Unit): Unit = {
  val writer = new PrintWriter(new File(fileName))
  try { codeBlock(writer) } finally { writer.close() }
}
writeToFile("output.txt") { writer =>
  writer write "hello from Scala"
}
