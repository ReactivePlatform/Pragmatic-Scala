/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
def findMax(temperatures : List[Int]) = {
  var highTemperature = Integer.MIN_VALUE
  for(temperature <- temperatures) {
   highTemperature = Math.max(highTemperature, temperature)
  }
  highTemperature
}

println(findMax(List(23, 27, 17)))
