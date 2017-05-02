/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
public class UseEquipment {
  public static int printAndReturn(int value) {
    System.out.println("called with " + value);
    return value;
  }
  
  public static void main(String[] args) {
    Equipment equipment = new Equipment();
    
    equipment.simulate(4, value -> printAndReturn(value));
  }
}