/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
public class PerfectNumberFinder { 
  //Java code
  public static boolean isPerfect(int candidate) {
    return sumFactors(candidate) == 2 * candidate;
  }
  
  private static int sumFactors(int number) {
    int sum = 0;
                                   
    for(int i = 1; i <= number; i++) {
      if (number % i == 0) sum += i;        
    }
    
    return sum;
  } 
                                                   
  public static void main(String[] args) {
    System.out.println("6 is perfect? " + isPerfect(6));                     
    System.out.println("33550336 is perfect? " + isPerfect(33550336));
    System.out.println("33550337 is perfect? " + isPerfect(33550337));
  }
}
