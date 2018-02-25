import java.util.Date

def log(date: Date, message: String): Unit = {
  //...
  println(s"$date ---- $message")
}

val date = new Date(1420095600000L)
log(date, "message1")
log(date, "message2")
log(date, "message3")
val logWithDateBound = log(date, _: String)
logWithDateBound("message1")
logWithDateBound("message2")
logWithDateBound("message3")
