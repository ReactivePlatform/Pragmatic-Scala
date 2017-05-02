/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
public class ThreadSleep {
  public void someMethod() {
    // Java code
    try {
      Thread.sleep(1000);
    }                    
    catch(InterruptedException ex) {
      // Losing sleep over what to do here?
    }
  }
}
