/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
def getYearEndClosingPrice(symbol : String, year : Int) = {
  val url = s"http://ichart.finance.yahoo.com/table.csv?s=" +
    s"$symbol&a=11&b=01&c=$year&d=11&e=31&f=$year&g=m"
    
  val data = io.Source.fromURL(url).mkString
  val price = data.split("\n")(1).split(",")(4).toDouble  
  price
} 

// #snip
val symbols = List("AMD", "AAPL", "AMZN", "IBM", "ORCL", "MSFT") 
val year = 2014 

val (topStock, topPrice) = 
  symbols.map { ticker => (ticker, getYearEndClosingPrice(ticker, year)) } 
         .maxBy { stockPrice => stockPrice._2 } 

printf(s"Top stock of $year is $topStock closing at price $$$topPrice")
// #snip
