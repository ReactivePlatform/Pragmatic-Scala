class Person(val firstName: String, val lastName: String) {
  var position: String = _

  println(s"Creating $toString")

  def this(firstName: String, lastName: String, positionHeld: String) {
    this(firstName, lastName)
    position = positionHeld
  }
  override def toString: String = {
    s"$firstName $lastName holds $position position"
  }
}

val john = new Person("John", "Smith", "Analyst")
println(john)
val bill = new Person("Bill", "Walker")
println(bill)
