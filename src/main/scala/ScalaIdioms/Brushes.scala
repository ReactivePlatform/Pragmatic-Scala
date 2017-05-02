/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
class Brushes {
  var colors = new Array[String](5)
  
  def update(index: Int, color: String) { 
    if (index < 0 || index > 4) {
      throw new IllegalArgumentException("Invalid index. Must be between 0 and 4.")
    }
                         
    if (colors.contains(color)) {
      throw new IllegalArgumentException("Color already present.");
    }
    else {
      colors(index) = color
    }
  }
}

val brushes = new Brushes
brushes(0) = "Red"
brushes(1) = "Blue"
brushes(2) = "Green"

brushes(4) = "Orange"

try {
brushes.update(4, "Orange")
}
catch {
 case _ => println("Exception received")
}
