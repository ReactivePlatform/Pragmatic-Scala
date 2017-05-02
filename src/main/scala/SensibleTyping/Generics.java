/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
import java.util.ArrayList;

public class Generics {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>(); 
    
    list.add(1);
    list.add(2);
    //playWithList(list); 
    int total = 0;

    for(int index = 0; index < list.size(); index++) {
      int element = list.get(index); 
        // instead of ((Integer)(list.get(0))).intValue(); 
      total += element;
    }             
    
    System.out.println("Total is " + total);
  }
  
  public static void playWithList(ArrayList list) {
    list.add(1.0);
  }
}
