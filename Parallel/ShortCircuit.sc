def expensiveComputation() = {
  println("...assume slow operation...")
  false
}

def evaluate(input: Int): Unit = {
  println(s"evaluate called with $input")
  if (input >= 10 && expensiveComputation())
    println("doing work...")
  else
    println("skipping")
}

evaluate(0)
evaluate(100)
