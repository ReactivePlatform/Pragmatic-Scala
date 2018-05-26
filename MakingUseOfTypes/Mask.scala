import MyInterpolator._

object UseInterpolator extends App {
  val ssn = "123-45-6789"
  val account = "0246781263"
  val balance = 20145.23

  println(mask"""Account: $account
    |Social Security Number: $ssn
    |Balance: $$^$balance
    |Thanks for your business.""".stripMargin)
}
