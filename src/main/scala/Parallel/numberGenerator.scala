/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
println("//" + "START:SERIES_OUTPUT")
def generate(starting: Int) : Stream[Int] = {
  starting #:: generate(starting + 1)
}

println(generate(25))
println("//" + "END:SERIES_OUTPUT")

println("//" + "START:CALL_OUTPUT")
println(generate(25).take(10).force)
println(generate(25).take(10).toList)
println("//" + "END:CALL_OUTPUT")

println("//" + "START:CALL2_OUTPUT")
println(generate(25).takeWhile{ _ < 40 }.force)
println("//" + "END:CALL2_OUTPUT")
