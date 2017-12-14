/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
// #snip_8-25
class Cow {
  def ^(moon: Moon) = println("Cow jumped over the moon")
}        
class Moon {
  def ^:(cow: Cow) = println("This cow jumped over the moon too")
}
// #snip_8-25

// #snip_8-26
val cow = new Cow
val moon = new Moon

cow ^ moon
cow ^: moon
// #snip_8-26