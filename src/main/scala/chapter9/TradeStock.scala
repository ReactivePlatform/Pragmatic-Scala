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

//  #snip_9-8
trait Trade
case class Sell(stockSymbol: String, quantity: Int) extends Trade
case class Buy(stockSymbol: String, quantity: Int) extends Trade
case class Hedge(stockSymbol: String, quantity: Int) extends Trade
//  #snip_9-8

//  #snip_9-9
object TradeProcessor {
  def processTransaction(request : Trade) {
    request match {
      case Sell(stock, 1000) => println(s"Selling 1000-units of $stock")
      case Sell(stock, quantity) => 
            println(s"Selling $quantity units of $stock")
      case Buy(stock, quantity) if quantity > 2000 =>
        println(s"Buying $quantity (large) units of $stock")
      case Buy(stock, quantity) => 
            println(s"Buying $quantity units of $stock")
    }
  }
}
//  #snip_9-9


//  #snip_9-10
TradeProcessor.processTransaction(Sell("GOOG", 500))
TradeProcessor.processTransaction(Buy("GOOG", 700))
TradeProcessor.processTransaction(Sell("GOOG", 1000))
TradeProcessor.processTransaction(Buy("GOOG", 3000))
//  #snip_9-10