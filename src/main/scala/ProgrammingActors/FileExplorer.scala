/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
import akka.actor._
import java.io._

class FileExplorer extends Actor {
  def receive = {
    case dirName : String => 
        val file = new File(dirName)
        val children = file.listFiles()
        var filesCount = 0
        
        if(children != null) {
          children.filter { _.isDirectory }
                  .foreach { sender ! _.getAbsolutePath }
          filesCount = children.count { !_.isDirectory }
        } 

        sender ! filesCount
  }
}