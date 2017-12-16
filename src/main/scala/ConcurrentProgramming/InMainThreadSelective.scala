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

import scala.actors._
import Actor._
trait SingleThreadedActor extends Actor {
  override protected def scheduler() = new SingleThreadedScheduler
}
class MyActor1 extends Actor {
  def act() = println("Actor1 running in " + Thread.currentThread)
}
                      
class MyActor2 extends SingleThreadedActor {                     
  def act() = println("Actor2 running in " + Thread.currentThread)
}                                                      

println("Main running in " + Thread.currentThread)
new MyActor1().start()
new MyActor2().start()
actor { println("Actor 3 running in " + Thread.currentThread) }

receiveWithin(5000) { case _ => }