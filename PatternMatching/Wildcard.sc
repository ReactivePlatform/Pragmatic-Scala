object DayOfWeek extends Enumeration {
  val SUNDAY: DayOfWeek.Value = Value("Sunday")
  val MONDAY: DayOfWeek.Value = Value("Monday")
  val TUESDAY: DayOfWeek.Value = Value("Tuesday")
  val WEDNESDAY: DayOfWeek.Value = Value("Wednesday")
  val THURSDAY: DayOfWeek.Value = Value("Thursday")
  val FRIDAY: DayOfWeek.Value = Value("Friday")
  val SATURDAY: DayOfWeek.Value = Value("Saturday")
}

def activity(day: DayOfWeek.Value): Unit = {
  day match {
    case DayOfWeek.SUNDAY   => println("Eat, sleep, repeat...")
    case DayOfWeek.SATURDAY => println("Hang out with friends")
    case _                  => println("...code for fun...")
  }
}

activity(DayOfWeek.SATURDAY)
activity(DayOfWeek.MONDAY)
