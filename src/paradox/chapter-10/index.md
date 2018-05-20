# 第10章——处理异常

Java 的受检异常（checked exception）会强制开发人员捕获错误，包括那些开发人员并不关 心的，因此 Java 程序员经常会写一个空的 catch 代码块来抑制相关的异常，而不是将其引渡至 合理的位置上进行处理。Scala 不这样做。它让开发人员只处理自己关心的异常，并忽略其他异 常。这些没有处理的异常将会自动地传播。在本章中，我们将学到如何在 Scala 中处理异常。

## 10.1 Scala 中的异常

>ExceptionHandling/Throw.scala

@@snip[代码清单10-1](../../main/scala/chapter10/Throw.scala){ #snip }

>ExceptionHandling/JavaThreadSleep.java

@@snip[代码清单10-2](../../main/scala/chapter10/JavaThreadSleep.java){ #snip }

>ExceptionHandling/ThreadSleep.scala

@@snip[代码清单10-3](../../main/scala/chapter10/ThreadSleep.scala){ #snip }

>ExceptionHandling/Tax.scala

@@snip[代码清单10-4](../../main/scala/chapter10/Tax.scala){ #snip }

>ExceptionHandling/ExceptionHandling.scala

@@snip[代码清单10-5](../../main/scala/chapter10/ExceptionHandling.scala){ #snip }

*运行结果*

@@snip[代码清单10-5运行结果](../../main/scala/chapter10/shoutput/RunExceptionHandling.output){ #output }

>ExceptionHandling/CatchAll.scala

@@snip[代码清单10-6](../../main/scala/chapter10/CatchAll.scala){ #snip }

*运行结果*

@@snip[代码清单10-6运行结果](../../main/scala/chapter10/shoutput/RunCatchAll.output){ #output }

## 10.2 注意 catch 的顺序

>ExceptionHandling/JavaCatchOrder.java

@@snip[代码清单10-7](../../test/java/chapter10/JavaCatchOrder.java){ #snip }

*运行结果*

@@snip[代码清单10-7运行结果](../../main/scala/chapter10/compileroutput/JavaCatchOrder.output){ #output }

>ExceptionHandling/CatchOrder.scala

@@snip[代码清单10-8](../../main/scala/chapter10/CatchOrder.scala){ #snip }

*运行结果*

@@snip[代码清单10-8运行结果](../../main/scala/chapter10/shoutput/RunCatchOrder.output){ #output }