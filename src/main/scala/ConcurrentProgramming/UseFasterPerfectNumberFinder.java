/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
public class UseFasterPerfectNumberFinder {
  public static void main(String[] args) {                     
    System.out.println("6 is perfect? " + FasterPerfectNumberFinder.isPerfect(6));                     
    System.out.println("33550336 is perfect? " + FasterPerfectNumberFinder.isPerfect(33550336));
   System.out.println("33550337 is perfect? " + FasterPerfectNumberFinder.isPerfect(33550337));
  }
}
