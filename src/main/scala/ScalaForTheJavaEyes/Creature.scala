/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
class Creature(val id: Int) {
  Creature.count = Creature.count + 1
}

object Creature {                                    
  private var count: Int = 0
  
  def creatureCount : Int = count
  
  def apply(id: Int) : Creature = new Creature(id)
}                 
