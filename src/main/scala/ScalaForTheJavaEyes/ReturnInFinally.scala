/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
def method(input: Int) : Int = {
  println("Calling method(" + input + ")")
val result = 
  try {
    if (input >= 10 && input <= 30) throw new Exception
    3
  }
  catch {
    case _ => {
      if (input == 20 || input == 30) {
        return 4  
      }
      5
    }
  }  
  finally {         
   if (input >= 30) {
     return 6
   }
   
   7
  }

  println("returning from method(" + input + ")")
  result
}

println(method(1))
println(method(10))
println(method(20))
println(method(30))
println(method(40))
