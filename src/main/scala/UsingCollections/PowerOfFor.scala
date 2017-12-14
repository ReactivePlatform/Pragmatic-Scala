/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
// #snip_8-28
for (_ <- 1 to 3) { print("ho ") }
// #snip_8-28

// #snip_8-29
val result = for (i <- 1 to 10) 
  yield i * 2
// #snip_8-29

// #snip_8-30
val result2 = (1 to 10).map(_ * 2)
// #snip_8-30

// #snip_8-31
val doubleEven = for (i <- 1 to 10; if i % 2 == 0)
   yield i * 2
// #snip_8-31

// #snip_8-32
for {
  i <- 1 to 10
  if i % 2 == 0
}
 yield i * 2
// #snip_8-32

println(result)
println(doubleEven)                   
println(result2)
