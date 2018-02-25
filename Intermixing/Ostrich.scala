abstract class BirdWithProblem {
  def fly(): Unit
  //...
}
class Ostrich extends BirdWithProblem {
  override def fly(): Unit = {
    throw new NoFlyException
  }
  //...
}
