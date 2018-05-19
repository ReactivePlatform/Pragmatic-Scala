/*
 * Copyright 2018 pragmatic-scala.reactiveplatform.xyz
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

package chapter13

// #snip
import akka.actor._
import akka.pattern.ask
import akka.util.Timeout

import scala.concurrent.Await
import scala.concurrent.duration._

object UseActor extends App {

  case class Play(role: String)

  case class ReportCount(role: String)

  val system = ActorSystem("sample")

  val depp = system.actorOf(Props[HollywoodActor])
  val hanks = system.actorOf(Props[HollywoodActor])

  depp ! Play("Wonka")
  hanks ! Play("Gump")

  depp ! Play("Wonka")
  depp ! Play("Sparrow")

  println("Sent roles to play")

  implicit val timeout: Timeout = Timeout(2.seconds)
  val wonkaFuture = depp ? ReportCount("Wonka")
  val sparrowFuture = depp ? ReportCount("Sparrow")
  val gumpFuture = hanks ? ReportCount("Gump")

  val wonkaCount = Await.result(wonkaFuture, timeout.duration)
  val sparrowCount = Await.result(sparrowFuture, timeout.duration)
  val gumpCount = Await.result(gumpFuture, timeout.duration)

  println(s"Depp played Wonka $wonkaCount time(s)")
  println(s"Depp played Sparrow $sparrowCount time(s)")
  println(s"Hanks played Gump $gumpCount time(s)")

  val terminateFuture = system.terminate()
  Await.ready(terminateFuture, Duration.Inf)
}

case class Play(role: String)

case class ReportCount(role: String)

// #snip

