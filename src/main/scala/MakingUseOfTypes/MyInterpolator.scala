/***
 * Excerpted from "Pragmatic Scala",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsscala2 for more book information.
***/
object MyInterpolator {
  implicit class Interpolator(val context: StringContext) extends AnyVal {
    def mask(args: Any*) = {
      val processed = context.parts.zip(args).map { item =>
        val (text, expression) = item
        if(text.endsWith("^"))
          s"${text.split('^')(0)}$expression"
        else
          s"$text...${expression.toString takeRight 4}"
      }.mkString
      
      new StringBuilder(processed).append(context.parts.last)
    }
  }
}
