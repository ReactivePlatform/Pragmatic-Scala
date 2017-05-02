/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
def echo[T](input1: T, input2: T) = 
  println(s"got $input1 (${input1.getClass}) $input2 (${input2.getClass})")

println("//" + "START:USE_FUNCTION_OUTPUT")
echo("hello", "there")
echo(4, 5)
println("//" + "END:USE_FUNCTION_OUTPUT")

println("//" + "START:OOPS_OUTPUT")
echo("hi", 5)
println("//" + "END:OOPS_OUTPUT")

class Message[T](val content: T) {
  override def toString = s"message content is $content"
  
  def is(value: T) = value == content
}

println("//" + "START:USE_OUTPUT")
val message1 : Message[String] = new Message("howdy")
val message2 = new Message(42)

println(message1)
println(message1.is("howdy"))
println(message1.is("hi"))
println(message2.is(22))
println("//" + "END:USE_OUTPUT")
