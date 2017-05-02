/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
def routePlan(coordinates : List[Tuple2[Double, Double]])
    (mapper : Tuple2[Double, Double] => Unit) {
 //...
}

routePlan(/*...*/) { x : Tuple2[Double, Double] => /*...*/ } // Explicit Type, OK

routePlan(/*...*/) { x => /*...*/ } // Type is inferred

routePlan(/*...*/) { x : Int => /*...*/ } //ERROR: Typemismatch
