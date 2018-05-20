# 第11章——递归编程

使用解决子问题的方案解决一个问题，也就是递归，这种想法十分诱人。许多算法和 问题本质上都是递归的。一旦我们找到窍门，使用递归来设计解决方案就变得极富表现力 且直观。

## 11.1 一个简单的递归

>ProgrammingRecursions/Factorial.scala

@@snip[代码清单11-1](../../main/scala/chapter11/Factorial.scala){ #snip_11-1 }

*运行结果*

@@snip[代码清单11-1运行结果](../../main/scala/chapter11/output/factorial.output){ #output_11-1 }

>ProgrammingRecursions/Factorial.scala

@@snip[代码清单11-2](../../main/scala/chapter11/Factorial.scala){ #snip_11-2 }

>ProgrammingRecursions/Factorial.scala

@@snip[代码清单11-3](../../main/scala/chapter11/Factorial.scala){ #snip_11-3 }

*运行结果*

@@snip[代码清单11-3运行结果](../../main/scala/chapter11/output/factorial.output){ #output_11-3 }

##11.2 尾调用优化（TCO）

>ProgrammingRecursions/Mad.scala

@@snip[代码清单11-4](../../main/scala/chapter11/Mad.scala){ #snip }

*运行结果*

@@snip[代码清单11-4运行结果](../../main/scala/chapter11/shoutput/RunMad.output){ #output }

>ProgrammingRecursions/Mad2.scala

@@snip[代码清单11-5](../../main/scala/chapter11/Mad2.scala){ #snip }

*运行结果*

@@snip[代码清单11-5运行结果](../../main/scala/chapter11/shoutput/RunMad2.output){ #output }

@@snip[代码清单11-6](../../main/scala/chapter11/shoutput/ViewJar1.output){ #output }

@@snip[代码清单11-7](../../main/scala/chapter11/shoutput/ViewJar2.output){ #output }

>ProgrammingRecursions/FactorialNoTCO.scala

@@snip[代码清单11-8](../../test/scala/chapter11/FactorialNoTCO.scala){ #snip }

*运行结果*

@@snip[代码清单11-8运行结果](../../main/scala/chapter11/shoutput/RunFactorialNoTCO.output){ #output }

>ProgrammingRecursions/FactorialTCO.scala

@@snip[代码清单11-9](../../main/scala/chapter11/FactorialTCO.scala){ #snip }

*运行结果*

@@snip[代码清单11-9运行结果](../../main/scala/chapter11/shoutput/RunFactorialTCO.output){ #output }

## 11.3 蹦床调用

>ProgrammingRecursions/Words.scala

@@snip[代码清单11-10](../../main/scala/chapter11/Words.scala){ #snip }

*运行结果*

@@snip[代码清单11-10运行结果](../../main/scala/chapter11/output/words.output){ #output }

>ProgrammingRecursions/WordsTrampoline.scala

@@snip[代码清单11-11](../../main/scala/chapter11/WordsTrampoline.scala){ #snip }

*运行结果*

@@snip[代码清单11-11运行结果](../../main/scala/chapter11/output/wordsTrampoline.output){ #output }