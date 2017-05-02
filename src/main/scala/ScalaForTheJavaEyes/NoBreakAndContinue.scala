/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
def processMessages(messages: List[String]) {      
  var done = false
  var index = 0

  while (index < messages.length && !done) {             
     val message = messages(index)                    
     if (message == "quit") done = true
       
     if (message != "skip") {
       println("Processing " + message)
     }
     index += 1     
  }
}

processMessages(List("code", "skip", "test", "quit", "hack"))
