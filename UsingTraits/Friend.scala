trait Friend {
  val name: String
  def listen(): Unit = println(s"Your friend $name is listening")
}
