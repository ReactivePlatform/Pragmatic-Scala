public class APrintable implements Printable {
  public void print() {
    System.out.println("We can reuse the trait here if we like...");
    //Printable$class.print(this); // for 2.11.x
    Printable.super.print(); // for 2.12.x
  }
  
  public static void use(Printable printable) {
    printable.print();
  }
  
  public static void main(String[] args) {
    APrintable aPrintable = new APrintable();
    use(aPrintable);
  }
}
