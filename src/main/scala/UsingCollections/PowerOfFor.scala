/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
for (i <- 1 to 3) { print("ho ") }

val result = for (i <- 1 to 10) 
  yield i * 2

val result2 = (1 to 10).map(_ * 2)

val doubleEven = for (i <- 1 to 10; if i % 2 == 0)
   yield i * 2

for {
  i <- 1 to 10
  if i % 2 == 0
}
 yield i * 2

println(result)
println(doubleEven)                   
println(result2)
