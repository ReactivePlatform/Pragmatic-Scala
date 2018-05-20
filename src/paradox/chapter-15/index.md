# 第15章——使用Scala创建应用程序

在本章中，我们将会把在本书中学到的许多东西汇集到一起，并学习一些新东西。我们 将逐步构建一个应用程序，用于找到股票市场中的投资的净值。在这个练习中，我们将会看 到一些夺目的特性：简洁性与表现力、模式匹配的力量以及函数值/闭包和并发。此外，我们 还将学习 Scala 对 XML 处理的支持—一个在构建企业级应用时会极大受益的特性。 ①

>1. 从 Scala 2.11.x 版本开始，对 XML 的支持已经被移到了单独的模块中。——译者注

## 15.1 获取用户输入

>UsingScala/ConsoleInput.scala

@@snip[代码清单15-1](../../main/scala/chapter15/ConsoleInput.scala){ #snip }

*运行结果*

@@snip[代码清单15-1运行结果](../../main/scala/chapter15/shoutput/RunConsoleInput.output){ #snip_15-1_output }

## 15.2 读写文件

>UsingScala/WriteToFile.scala

@@snip[代码清单15-2](../../main/scala/chapter15/WriteToFile.scala){ #snip }

>UsingScala/ReadingFile.scala

@@snip[代码清单15-3](../../main/scala/chapter15/ReadingFile.scala){ #snip }

*运行结果*

@@snip[代码清单15-3运行结果](../../main/scala/chapter15/output/ReadingFile.output){ #snip_15-3_output }

>UsingScala/ReadingURL.scala

@@snip[代码清单15-4](../../main/scala/chapter15/ReadingURL.scala){ #snip }

*运行结果*

@@snip[代码清单15-4运行结果](../../main/scala/chapter15/output/ReadingURL.output){ #snip_15-4_output }

## 15.3 XML 作为一等公民

>UsingScala/UseXML.scala

@@snip[代码清单15-5](../../main/scala/chapter15/UseXML.scala){ #snip_15-5 }

*运行结果*

@@snip[代码清单15-5运行结果](../../main/scala/chapter15/output/UseXML.output){ #snip_15-5_output }

>UsingScala/UseXML.scala

@@snip[代码清单15-6](../../main/scala/chapter15/UseXML.scala){ #snip_15-6 }

*运行结果*

@@snip[代码清单15-6运行结果](../../main/scala/chapter15/output/UseXML.output){ #snip_15-6_output }

>UsingScala/UseXML.scala

@@snip[代码清单15-7](../../main/scala/chapter15/UseXML.scala){ #snip_15-7 }

*运行结果*

@@snip[代码清单15-7运行结果](../../main/scala/chapter15/output/UseXML.output){ #snip_15-7_output }

>UsingScala/UseXML.scala

@@snip[代码清单15-8](../../main/scala/chapter15/UseXML.scala){ #snip_15-8 }

*运行结果*

@@snip[代码清单15-8运行结果](../../main/scala/chapter15/output/UseXML.output){ #snip_15-8_output }

>UsingScala/UseXML.scala

@@snip[代码清单15-9](../../main/scala/chapter15/UseXML.scala){ #snip_15-9 }

*运行结果*

@@snip[代码清单15-9运行结果](../../main/scala/chapter15/output/UseXML.output){ #snip_15-9_output }

## 15.4 读写 XML

*stocks.xml*

@@snip[代码清单15-10](../../main/scala/chapter15/stocks.xml.input){ #snip }

>UsingScala/ReadWriteXML.scala

@@snip[代码清单15-11](../../main/scala/chapter15/ReadWriteXML.scala){ #snip_15-11 }

*运行结果*

@@snip[代码清单15-11运行结果](../../main/scala/chapter15/output/ReadWriteXML.output){ #snip_15-11_output }

>UsingScala/ReadWriteXML.scala

@@snip[代码清单15-12](../../main/scala/chapter15/ReadWriteXML.scala){ #snip_15-12 }

*运行结果*

@@snip[代码清单15-12运行结果](../../main/scala/chapter15/output/ReadWriteXML.output){ #snip_15-12_output }

>UsingScala/ReadWriteXML.scala

@@snip[代码清单15-13](../../main/scala/chapter15/ReadWriteXML.scala){ #snip_15-13 }

*运行结果*

@@snip[代码清单15-13运行结果](../../main/scala/chapter15/output/ReadWriteXML.output){ #snip_15-13_output }

*示例文件*

@@snip[调用雅虎财经的运行结果](../../main/scala/chapter15/output/GOOG.out){ #snip_output }

## 15.5 从 Web 获取股票价格

>UsingScala/StockPriceFinder.scala

@@snip[代码清单15-14](../../main/scala/chapter15/StockPriceFinder.scala){ #snip }

>UsingScala/FindTotalWorthSequential.scala

@@snip[代码清单15-15](../../main/scala/chapter15/FindTotalWorthSequential.scala){ #snip }

*运行结果*

@@snip[代码清单15-15运行结果](../../main/scala/chapter15/shoutput/RunFindTotalWorthSequential.output){ #snip_15-15_output }

## 15.6 编写并发的资产净值应用程序

>UsingScala/FindTotalWorthConcurrent.scala

@@snip[代码清单15-16](../../main/scala/chapter15/FindTotalWorthConcurrent.scala){ #snip }

*运行结果*

@@snip[代码清单15-16运行结果](../../main/scala/chapter15/shoutput/RunFindTotalWorthConcurrent.output){ #snip_15-16_output }


