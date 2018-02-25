object EquipmentUseDry2 extends App {
  def calculator(input: Int) = { println(s"calc with $input"); input }

  val equipment1 = new Equipment(calculator)
  val equipment2 = new Equipment(calculator)

  equipment1.simulate(4)
  equipment2.simulate(6)
}
