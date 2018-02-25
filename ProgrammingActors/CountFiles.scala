import akka.actor._

object CountFiles extends App {
  val system = ActorSystem("sample")

  val filesCounter = system.actorOf(Props[FilesCounter])

  filesCounter ! args(0)
}
