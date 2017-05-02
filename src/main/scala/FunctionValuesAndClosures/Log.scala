/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
import java.util.Date

def log(date: Date, message: String) = {
 //...                                
 println(s"$date ---- $message")
}

val date = new Date(1420095600000L)
log(date, "message1")
log(date, "message2")
log(date, "message3")

{
val date = new Date(1420095600000L)
val logWithDateBound = log(date, _ : String)
logWithDateBound("message1")
logWithDateBound("message2")
logWithDateBound("message3")
}