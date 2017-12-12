/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
// #snip
val colors1 = Set("Blue", "Green", "Red")
println(s"colors1: $colors1")

val colors2 = colors1 + "Black"
println(s"colors2: $colors2")
println(s"colors1: $colors1")
// #snip
