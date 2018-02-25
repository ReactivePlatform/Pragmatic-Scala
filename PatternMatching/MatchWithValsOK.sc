class Sample {
  val MAX = 100

  def process(input: Int): Unit = {
    input match {
      case MAX => println("You matched max")
    }
  }
}

val sample = new Sample
try {
  sample.process(0)
} catch {
  case ex: Throwable => println(ex)
}
sample.process(100)
