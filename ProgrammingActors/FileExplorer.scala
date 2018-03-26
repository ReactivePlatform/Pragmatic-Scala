import akka.actor._
import java.io._

class FileExplorer extends Actor {
  def receive: Receive = {
    case dirName: String =>
      val file = new File(dirName)
      val children = file.listFiles()
      var filesCount = 0

      if (children != null) {
        children.filter { _.isDirectory }
          .foreach { sender ! _.getAbsolutePath }
        filesCount = children.count { !_.isDirectory }
      }

      sender ! filesCount
  }
}
