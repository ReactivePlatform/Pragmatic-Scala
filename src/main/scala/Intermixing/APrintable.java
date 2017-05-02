/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
public class APrintable implements Printable {
  public void print() {
    System.out.println("We can reuse the trait here if we like...");
    Printable$class.print(this); 
    
  }
  
  public static void use(Printable printable) {
    printable.print();
  }
  
  public static void main(String[] args) {
    APrintable aPrintable = new APrintable();
    use(aPrintable);
  }
}