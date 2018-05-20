# 第9章——模式匹配和正则表达式

模式匹配（pattern matching）在 Scala 被广泛使用的特性中排在第二位，仅次于函数值和 闭包。Scala 对于模式匹配的出色支持意味着，在并发编程中在处理 Actor 接收到的消息时， 将会大量地使用它。在本章中，我们将学到 Scala 的模式匹配的机制、case 类和提取器，以 及如何创建和使用正则表达式。

## 9.1 模式匹配综述

>PatternMatching/MatchLiterals.scala

@@snip[代码清单9-1](../../main/scala/chapter9/MatchLiterals.scala){ #snip }

*运行结果*

@@snip[代码清单9-1运行结果](../../main/scala/chapter9/output/MatchLiterals.output){ #snip_9-1_output }

>PatternMatching/Wildcard.scala

@@snip[代码清单9-2](../../main/scala/chapter9/Wildcard.scala){ #snip }

*运行结果*

@@snip[代码清单9-2运行结果](../../main/scala/chapter9/output/Wildcard.output){ #snip_9-2_output }

>PatternMatching/MatchTuples.scala

@@snip[代码清单9-3](../../main/scala/chapter9/MatchTuples.scala){ #snip }

*运行结果*

@@snip[代码清单9-3运行结果](../../main/scala/chapter9/output/MatchTuples.output){ #snip_9-3_output }

>PatternMatching/MatchList.scala

@@snip[代码清单9-4](../../main/scala/chapter9/MatchList.scala){ #snip }

*运行结果*

@@snip[代码清单9-4运行结果](../../main/scala/chapter9/output/MatchList.output){ #snip_9-4_output }

>PatternMatching/MatchTypes.scala

@@snip[代码清单9-5](../../main/scala/chapter9/MatchTypes.scala){ #snip }

*运行结果*

@@snip[代码清单9-5运行结果](../../main/scala/chapter9/output/MatchTypes.output){ #snip_9-5_output }

## 9.2 case 表达式中的模式变量和常量

>PatternMatching/MatchWithField.scala

@@snip[代码清单9-6](../../main/scala/chapter9/MatchWithField.scala){ #snip }

*运行结果*

@@snip[代码清单9-6运行结果](../../main/scala/chapter9/output/MatchWithField.output){ #snip_9-6_output }

>PatternMatching/MatchWithField1.scala

@@snip[代码清单9-7](../../main/scala/chapter9/MatchWithField1.scala){ #snip }

*运行结果*

@@snip[代码清单9-7运行结果](../../main/scala/chapter9/output/MatchWithField1.output){ #output }

>PatternMatching/MatchWithField2.scala

@@snip[代码清单9-8](../../main/scala/chapter9/MatchWithField2.scala){ #snip }

*运行结果*

@@snip[代码清单9-8运行结果](../../main/scala/chapter9/output/MatchWithField2.output){ #output }

>PatternMatching/MatchWithValsOK.scala

@@snip[代码清单9-9](../../main/scala/chapter9/MatchWithValsOK.scala){ #snip }

*运行结果*

@@snip[代码清单9-9运行结果](../../main/scala/chapter9/output/MatchWithValsOK.output){ #output }

## 9.3 使用 case 类进行模式匹配

>PatternMatching/TradeStock.scala

@@snip[代码清单9-10](../../main/scala/chapter9/TradeStock.scala){ #snip_9-10 }

>PatternMatching/TradeStock.scala

@@snip[代码清单9-11](../../main/scala/chapter9/TradeStock.scala){ #snip_9-11 }

>PatternMatching/TradeStock.scala

@@snip[代码清单9-12](../../main/scala/chapter9/TradeStock.scala){ #snip_9-12 }

*运行结果*

@@snip[代码清单9-12运行结果](../../main/scala/chapter9/output/TradeStock.output){ #output }

>PatternMatching/ThingsAcceptor.scala

@@snip[代码清单9-13](../../main/scala/chapter9/ThingsAcceptor.scala){ #snip_9-13 }

>PatternMatching/ThingsAcceptor.scala

@@snip[代码清单9-14](../../main/scala/chapter9/ThingsAcceptor.scala){ #snip_9-14 }

*运行结果*

@@snip[代码清单9-14运行结果](../../main/scala/chapter9/output/ThingsAcceptor.output){ #output }

>PatternMatching/ThingsAcceptor2.scala

@@snip[代码清单9-15](../../test/scala/chapter9/ThingsAcceptor2.scala){ #snip }

## 9.4 提取器和正则表达式

>PatternMatching/Extractor1.scala

@@snip[代码清单9-16](../../main/scala/chapter9/Extractor1.scala){ #snip_9-16 }

>PatternMatching/Extractor1.scala

@@snip[代码清单9-17](../../main/scala/chapter9/Extractor1.scala){ #snip_9-17 }

>PatternMatching/Extractor1.scala

@@snip[代码清单9-18](../../main/scala/chapter9/Extractor1.scala){ #snip_9-18 }

*运行结果*

@@snip[代码清单9-14运行结果](../../main/scala/chapter9/output/Extractor1.output){ #snip_9-14_output }

>PatternMatching/Extractor.scala

@@snip[代码清单9-17](../../main/scala/chapter9/Extractor.scala){ #snip_9-17 }

>PatternMatching/Extractor.scala

@@snip[代码清单9-18](../../main/scala/chapter9/Extractor.scala){ #snip_9-18 }

>PatternMatching/Extractor.scala

@@snip[代码清单9-19](../../main/scala/chapter9/Extractor.scala){ #snip_9-19 }

*运行结果*

@@snip[代码清单9-19运行结果](../../main/scala/chapter9/output/Extractor.output){ #snip_9-19_output }

>PatternMatching/Extractor2.scala

@@snip[代码清单9-20](../../main/scala/chapter9/Extractor2.scala){ #snip_9-20 }

*运行结果*

@@snip[代码清单9-20运行结果](../../main/scala/chapter9/output/Extractor2.output){ #snip_9-20_output }

>PatternMatching/RegularExpr.scala

@@snip[代码清单9-21](../../main/scala/chapter9/RegularExpr.scala){ #snip_9-21 }

>PatternMatching/RegularExpr.scala

@@snip[代码清单9-22](../../main/scala/chapter9/RegularExpr.scala){ #snip_9-22 }

>PatternMatching/RegularExpr.scala

@@snip[代码清单9-23](../../main/scala/chapter9/RegularExpr.scala){ #snip_9-23 }

*运行结果*

@@snip[代码清单9-23运行结果](../../main/scala/chapter9/output/RegularExpr.output){ #snip_9-23_output }

>PatternMatching/MatchUsingRegex.scala

@@snip[代码清单9-24](../../main/scala/chapter9/MatchUsingRegex.scala){ #snip_9-24 }

*运行结果*

@@snip[代码清单9-24运行结果](../../main/scala/chapter9/output/MatchUsingRegex.output){ #snip_9-24_output }

>PatternMatching/MatchUsingRegex2.scala

@@snip[代码清单9-25](../../main/scala/chapter9/MatchUsingRegex2.scala){ #snip_9-25 }

*运行结果*

@@snip[代码清单9-25运行结果](../../main/scala/chapter9/output/MatchUsingRegex2.output){ #snip_9-25_output }