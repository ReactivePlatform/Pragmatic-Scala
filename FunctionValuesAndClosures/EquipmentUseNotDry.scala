object EquipmentUseNotDry extends App {
  val equipment1 = new Equipment(
    { input => println(s"calc with $input"); input })
  val equipment2 = new Equipment(
    { input => println(s"calc with $input"); input })

  equipment1.simulate(4)
  equipment2.simulate(6)
}
