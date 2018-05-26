import scala.io._

def read = StdIn.readInt()

@volatile lazy val first = read
@volatile lazy val second = read

if (Math.random() < 0.5)
  second

println(first - second)
