/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
def printMethodInfo(methodName: String) {   
  println("The return type of " + methodName + " is " +
    getClass().getDeclaredMethod(methodName, null).getReturnType().getName())  
}

def method1() { 6 }
def method2() = { 6 }
def method3() = 6
def method4 : Double = 6

printMethodInfo("method1")
printMethodInfo("method2")
printMethodInfo("method3")
printMethodInfo("method4")
