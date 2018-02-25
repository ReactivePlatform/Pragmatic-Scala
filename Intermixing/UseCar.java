//Java code
package automobiles.users;
import automobiles.Car;

public class UseCar {
  public static void main(String[] args) {
    Car car = new Car(2009);
    
    System.out.println(car);
    car.drive(10);
    System.out.println(car);
  }
}
