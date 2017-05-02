/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
import java.util.*;

public class DoubleValues {
  public static void main(String[] args) {
    for(int val : doubleValues(new int[] {1, 2, 3, 4, 5})) {
      System.out.print(val + " ");
    }                             
    
    System.out.println("\n");

    for(int val : doubleValuesAgain(new int[] {1, 2, 3, 4, 5})) {
      System.out.print(val + " ");
    }                             
    System.out.println("\n");
  }                         
  
  // Java code
  public static int[] doubleValues(int[] values) {
    int[] result = new int[values.length];
    for(int i = 0; i < values.length; i++) {
      result[i] = values[i] * 2;
    }
    return result;
  }

  // Java code
  public static int[] doubleValuesAgain(int[] values) {
    int[] result = new int[values.length];
    int count = 0;
    for(int val : values) {
      result[count++] = val * 2;
    }        
    return result;
  }
}
