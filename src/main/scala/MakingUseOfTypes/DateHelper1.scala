/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
import scala.language.implicitConversions
import java.time.LocalDate

class DateHelper(offset: Int) {
  def days(when: String) = {
    val today = LocalDate.now
    when match {
      case "ago" => today.minusDays(offset)
      case "from_now" => today.plusDays(offset)
      case _ => today
    }
  }
}

implicit def convertInt2DateHelper(offset: Int) = new DateHelper(offset)

val ago = "ago"              
val from_now = "from_now"

val past = 2 days ago
val appointment = 5 days from_now

println(past)     
println(appointment)
