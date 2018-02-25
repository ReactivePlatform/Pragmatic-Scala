for (amount <- List(100.0, 0.009, -2.0, 1000001.0)) {
  try {
    print(s"Amount: $$$amount ")
    println(s"Tax: $$${Tax.taxFor(amount)}")
  } catch {
    case ex: IllegalArgumentException => println(ex.getMessage)
    case _: Throwable                 => println("Something went wrong")
  }
}
