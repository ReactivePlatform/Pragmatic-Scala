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

package society {

  package professional {
    class Executive {
      private[professional] var workDetails = null
      private[society] var friends = null
      private[this] var secrets = null

      def help(another: Executive): Unit = {
        println(another.workDetails)
        println(secrets)
        println(another.secrets) //ERROR
      }
    }

    class Assistant {
      def assist(anExec: Executive): Unit = {
        println(anExec.workDetails)
        println(anExec.friends)
      }
    }
  }

  package social {
    class Acquaintance {
      def socialize(person: professional.Executive) {
        println(person.friends)
        println(person.workDetails) // ERROR
      }
    }
  }
}
