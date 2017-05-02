/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
import java.util.*;

public class FindMax {
  public static void main(String[] args) {
   List<Integer> temperatures = Arrays.asList(23, 27, 17);

   System.out.println(findMax(temperatures));
  }

 public static int findMax(List<Integer> temperatures) { //Java code
   int highTemperature = Integer.MIN_VALUE;
   for(int temperature : temperatures) {
    highTemperature = Math.max(highTemperature, temperature);
   }
   return highTemperature;
 }
}
