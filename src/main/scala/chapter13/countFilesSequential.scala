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

package chapter13

object countFilesSequential extends App {
  // ##snip
  import java.io.File

  def getChildren(file: File) = {
    val children = file.listFiles()
    if (children != null) children.toList else List()
  }

  val start = System.nanoTime
  val exploreFrom = new File(args(0))

  var count = 0L
  var filesToVisit = List(exploreFrom)

  while (filesToVisit.size > 0) {
    val head = filesToVisit.head
    filesToVisit = filesToVisit.tail

    val children = getChildren(head)
    count = count + children.count { !_.isDirectory }
    filesToVisit = filesToVisit ::: children.filter { _.isDirectory }
  }

  val end = System.nanoTime
  println(s"Number of files found: $count")
  println(s"Time taken: ${(end - start) / 1.0e9} seconds")
  // ##snip
}
