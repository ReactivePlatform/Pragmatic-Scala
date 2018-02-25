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
