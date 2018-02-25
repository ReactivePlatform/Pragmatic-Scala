//Java code
class Penguin extends Bird {      
  public void fly() throws NoFlyException {
    throw new NoFlyException();
  }
  //...
}
