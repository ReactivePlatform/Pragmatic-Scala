/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
class Pet(val name: String) {
  override def toString = name
}

class Dog(override val name: String) extends Pet(name)

def workWithPets(pets: Array[Pet]) {}

def playWithPets[T <: Pet](pets: Array[T]) = 
  println("Playing with pets: " + pets.mkString(", "))          

val dogs = Array(new Dog("Rover"), new Dog("Comet"))
/*
workWithPets(dogs) // Compilation ERROR
*/

playWithPets(dogs)

def copyPets[S, D >: S](fromPets: Array[S], toPets: Array[D]) = { //...  
}

val pets = new Array[Pet](10)
copyPets(dogs, pets)
