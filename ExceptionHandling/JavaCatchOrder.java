//Java code—will not compile due to incorrect catch order
public class JavaCatchOrder {
  public void catchOrderExample() {
    try {
      String str = "hello";
      System.out.println(str.charAt(31));
    }
    catch(Exception ex) { System.out.println("Exception caught"); }
    catch(StringIndexOutOfBoundsException ex) { //ERROR
      System.out.println("Invalid Index"); }
  }
}
