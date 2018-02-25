def compute(input: Int) =
  if (input > 0)
    Right(math.sqrt(input))
  else
    Left("Error computing, invalid input")

def displayResult(result: Either[String, Double]): Unit = {
  println(s"Raw: $result")
  result match {
    case Right(value) => println(s"result $value")
    case Left(err)    => println(s"Error: $err")
  }
}
displayResult(compute(4))
displayResult(compute(-4))
