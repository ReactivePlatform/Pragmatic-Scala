/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
val arr1 = new Array[int](3)
arr1(0) = 1
arr1(1) = 2
arr1(2) = 3

val arr2 = Array(1, 2, 3)

val arr3 = Array("one", "two", "three")
     
println(arr1.getClass())
println(arr2.getClass())
println(arr3.getClass())
