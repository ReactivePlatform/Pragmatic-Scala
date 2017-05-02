/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
package society  { 

  package professional {
    class Executive {
      private[professional] var workDetails = null
      private[society] var friends = null
      private[this] var secrets = null
      
      def help(another : Executive) = {
        println(another.workDetails) 
        println(secrets)
        println(another.secrets) //ERROR
      }
    }
    
    class Assistant {
      def assist(anExec: Executive) = {
        println(anExec.workDetails)
        println(anExec.friends)
      }
    }
  }
    
  package social {
    class Acquaintance {
      def socialize(person: professional.Executive) {
        println(person.friends)
        println(person.workDetails) // ERROR
      }
    }
  }
}
