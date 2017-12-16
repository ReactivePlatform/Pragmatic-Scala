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

//Java code 
class Fruit {} 
class Banana extends Fruit {}
class Apple extends Fruit {}

public class Trouble {
  public static void main(String[] args) {
    Banana[] basketOfBanana = new Banana[2];
    basketOfBanana[0] = new Banana();
    
    Fruit[] basketOfFruits = basketOfBanana; 
    basketOfFruits[1] = new Apple(); 
    
    for(Banana banana : basketOfBanana) {
      System.out.println(banana);
    }    
  }
}
