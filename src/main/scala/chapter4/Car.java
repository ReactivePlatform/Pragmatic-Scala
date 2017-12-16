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

package chapter4;

//Java example
public class Car {
  private final int year;
  private int miles;    
  
  public Car(int yearOfMake) { year = yearOfMake; }
  
  public int getYear() { return year; }
  public int getMiles() { return miles; }
  
  public void drive(int distance) {                   
    miles += Math.abs(distance);
  }
}
