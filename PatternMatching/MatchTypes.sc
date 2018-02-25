def process(input: Any): Unit = {
  input match {
    case (_: Int, _: Int)          => print("Processing (int, int)... ")
    case (_: Double, _: Double)    => print("Processing (double, double)... ")
    case msg: Int if msg > 1000000 => println("Processing int > 1000000")
    case _: Int                    => print("Processing int... ")
    case _: String                 => println("Processing string... ")
    case _                         => printf(s"Can't handle $input... ")
  }
}

process((34.2, -159.3))
process(0)
process(1000001)
process(2.2)
