/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
//Java code 
class Fruit {} 
class Banana extends Fruit {}
class Apple extends Fruit {}

public class Trouble {
  public static void main(String[] args) {
    Banana[] basketOfBanana = new Banana[2];
    basketOfBanana[0] = new Banana();
    
    Fruit[] basketOfFruits = basketOfBanana; 
    basketOfFruits[1] = new Apple(); 
    
    for(Banana banana : basketOfBanana) {
      System.out.println(banana);
    }    
  }
}
