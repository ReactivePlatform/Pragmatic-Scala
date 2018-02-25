class Complex(val real: Int, val imaginary: Int) {
  def +(operand: Complex): Complex = {
    println("Calling +")
    new Complex(real + operand.real, imaginary + operand.imaginary)
  }

  def *(operand: Complex): Complex = {
    println("Calling *")
    new Complex(
      real * operand.real - imaginary * operand.imaginary,
      real * operand.imaginary + imaginary * operand.real)
  }
  override def toString: String = {
    val sign = if (imaginary < 0) "" else "+"
    s"$real$sign${imaginary}i"
  }
}

val c1 = new Complex(1, 4)
val c2 = new Complex(2, -3)
val c3 = new Complex(2, 2)
println(c1 + c2 * c3)
