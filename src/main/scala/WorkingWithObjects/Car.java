/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
//Java example
public class Car {
  private final int year;
  private int miles;    
  
  public Car(int yearOfMake) { year = yearOfMake; }
  
  public int getYear() { return year; }
  public int getMiles() { return miles; }
  
  public void drive(int distance) {                   
    miles += Math.abs(distance);
  }
}
