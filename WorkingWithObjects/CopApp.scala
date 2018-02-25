object CopApp extends App {
  type Cop = PoliceOfficer

  val topCop = new Cop("Jack")
  println(topCop.getClass)
}
