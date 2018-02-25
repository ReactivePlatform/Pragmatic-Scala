class Microwave {
  def start(): Unit = println("started")
  def stop(): Unit = println("stopped")
  private def turnTable(): Unit = println("turning table")
}
val microwave = new Microwave
microwave.start() // OK
