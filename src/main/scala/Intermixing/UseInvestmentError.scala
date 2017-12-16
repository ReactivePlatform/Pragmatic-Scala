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

import investments._

object UseInvestment extends App {
  {
    val investment = new Investment("XYZ Corporation", InvestmentType.STOCK)
    val theYield1 = investment.yield   //ERROR
  }
  {
    val investment = new Investment("XYZ Corporation", InvestmentType.STOCK)
    val theYield2 = investment.yield() //ERROR        
  }
}
