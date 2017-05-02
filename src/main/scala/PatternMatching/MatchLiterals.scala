/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
def activity(day: String) {
  day match {
    case "Sunday" => print("Eat, sleep, repeat... ")
    case "Saturday" => print("Hang out with friends... ")
    case "Monday" => print("...code for fun...")
    case "Friday" => print("...read a good book...")
  }
}
List("Monday", "Sunday", "Saturday").foreach { activity }
