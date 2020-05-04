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
import akka.routing._

class FilesCounter extends Actor {
  val start: Long = System.nanoTime
  var filesCount = 0L
  var pending = 0

  val fileExplorers: ActorRef =
    context.actorOf(RoundRobinPool(100).props(Props[FileExplorer]))

  def receive: Receive = {
    case dirName: String =>
      pending = pending + 1
      fileExplorers ! dirName

    case count: Int =>
      filesCount = filesCount + count
      pending = pending - 1

      if (pending == 0) {
        val end = System.nanoTime
        println(s"Files count: $filesCount")
        println(s"Time taken: ${(end - start) / 1.0e9} seconds")
        context.system.terminate()
      }
  }
}

// #snip
