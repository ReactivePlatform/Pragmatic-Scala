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

package Introduction;

import java.util.*;

public class DoubleValues {
  public static void main(String[] args) {
    for(int val : doubleValues(new int[] {1, 2, 3, 4, 5})) {
      System.out.print(val + " ");
    }                             
    
    System.out.println("\n");

    for(int val : doubleValuesAgain(new int[] {1, 2, 3, 4, 5})) {
      System.out.print(val + " ");
    }                             
    System.out.println("\n");
  }                         
  
  // Java code
  public static int[] doubleValues(int[] values) {
    int[] result = new int[values.length];
    for(int i = 0; i < values.length; i++) {
      result[i] = values[i] * 2;
    }
    return result;
  }

  // Java code
  public static int[] doubleValuesAgain(int[] values) {
    int[] result = new int[values.length];
    int count = 0;
    for(int val : values) {
      result[count++] = val * 2;
    }        
    return result;
  }
}
