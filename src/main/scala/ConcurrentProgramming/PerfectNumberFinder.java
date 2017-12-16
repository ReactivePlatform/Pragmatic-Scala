/*
 * Copyright 2017 pragmatic-scala.reactiveplatform.xyz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

public class PerfectNumberFinder { 
  //Java code
  public static boolean isPerfect(int candidate) {
    return sumFactors(candidate) == 2 * candidate;
  }
  
  private static int sumFactors(int number) {
    int sum = 0;
                                   
    for(int i = 1; i <= number; i++) {
      if (number % i == 0) sum += i;        
    }
    
    return sum;
  } 
                                                   
  public static void main(String[] args) {
    System.out.println("6 is perfect? " + isPerfect(6));                     
    System.out.println("33550336 is perfect? " + isPerfect(33550336));
    System.out.println("33550337 is perfect? " + isPerfect(33550337));
  }
}
