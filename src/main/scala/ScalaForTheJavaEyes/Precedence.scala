/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
class Item(val name: String) {
  def +(other: Item) : Item = new Item("'" + name + " and " + other.name + "'")
  def +-(other: Item) : Item = new Item("--" + name + " and some " + other.name + "--")
  
  def &(other: Item) : Item = new Item(name + " with " + other.name)
  
  override def toString : String = name
}

val coffee = new Item("Coffee")
val sugar = new Item("Sugar")
val milk = new Item("Milk")
val cream = new Item("Cream")
                
println(coffee & milk + sugar +- cream)
