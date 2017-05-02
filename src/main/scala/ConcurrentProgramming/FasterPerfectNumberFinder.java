/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
//Java code
public class FasterPerfectNumberFinder {      
  static class Sum {
    private int _sum;
    public synchronized int get() { return _sum; }
    public synchronized void set(int value) { _sum = value; }  
  } 

  private static int sumFactorsInRange(int candidate, int lower, int upper) {
    int partialSum = 0;                               
    for(int i = lower; i <= upper; i++) {
      if (candidate % i == 0) partialSum += i;        
    }
    
    return partialSum;
  } 

  public static boolean isPerfect(final int candidate) { 
    int RANGE = 1000000;                                                                               
    int numberOfPartitions = (int)(Math.ceil(candidate * 1.0 / RANGE));    
    final Sum sum = new Sum();
    
    Thread[] factorsSummingThread = new Thread[numberOfPartitions];
          
    for (int i = 0; i < numberOfPartitions; i++) { 
      final int lower = i * RANGE + 1;
      final int upper = Math.min((i + 1) * RANGE, candidate);

      Thread thread = new Thread(new Runnable() {
        public void run() { 
          synchronized(sum) {
            sum.set(sum.get() + sumFactorsInRange(candidate, lower, upper));
          }
        }
      });
      factorsSummingThread[i] = thread;
      thread.start();
    }  

    for(int i =0; i < numberOfPartitions; i++) {    
      try {
        factorsSummingThread[i].join();
      }
      catch(InterruptedException ex) {
        // Should I care?
      }
    }
    
    return sum.get() == 2 * candidate;
  }
}
