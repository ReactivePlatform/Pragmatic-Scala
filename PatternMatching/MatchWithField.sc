class Sample {
  val max = 100

  def process(input: Int): Unit = {
    input match {
      case max => println(s"You matched max $max")
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
