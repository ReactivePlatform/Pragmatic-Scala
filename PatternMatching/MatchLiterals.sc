def activity(day: String): Unit = {
  day match {
    case "Sunday"   => print("Eat, sleep, repeat... ")
    case "Saturday" => print("Hang out with friends... ")
    case "Monday"   => print("...code for fun...")
    case "Friday"   => print("...read a good book...")
  }
}
List("Monday", "Sunday", "Saturday").foreach { activity }
