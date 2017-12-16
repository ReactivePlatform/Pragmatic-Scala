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

import java.util.ArrayList;

public class Generics {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>(); 
    
    list.add(1);
    list.add(2);
    //playWithList(list); 
    int total = 0;

    for(int index = 0; index < list.size(); index++) {
      int element = list.get(index); 
        // instead of ((Integer)(list.get(0))).intValue(); 
      total += element;
    }             
    
    System.out.println("Total is " + total);
  }
  
  public static void playWithList(ArrayList list) {
    list.add(1.0);
  }
}
