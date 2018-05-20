# 第16章——单元测试

代码将总是按照被编写的行为运行—单元测试将确保它做的确实符合编写者的本意。 在开发应用程序的过程中，单元测试还有助于确保代码行为持续符合预期。

## 16.1 使用 JUnit

>UnitTesting/UsingJUnit.scala

@@snip[代码清单16-1](../../main/scala/chapter16/UsingJUnit.scala){ #snip }

*执行命令*

@@snip[代码清单16-1编译命令](../../main/scala/chapter16/RunUsingJUnit.sh){ #snip }

*运行结果*

@@snip[代码清单16-1运行结果](../../main/scala/chapter16/shoutput/RunUsingJUnit.output){ #snip_16-1_output }

## 16.2 使用 ScalaTest

>UnitTesting/UsingScalaTest.scala

@@snip[代码清单16-2](../../main/scala/chapter16/UsingScalaTest.scala){ #snip }

*执行命令*

@@snip[代码清单16-2编译命令](../../main/scala/chapter16/RunUsingScalaTest.sh){ #snip }

*运行结果*

@@snip[代码清单16-2运行结果](../../main/scala/chapter16/shoutput/RunUsingScalaTest.output){ #snip_16-2_output }

## 16.3 使用 Mockito

>UnitTesting/WordScorerTest.scala (withoutmock)

@@snip[代码清单16-3](../../main/scala/chapter16/withoutmock/WordScorerTest.scala){ #snip }

>UnitTesting/WordScorer.scala (withoutmock)

@@snip[代码清单16-4](../../main/scala/chapter16/withoutmock/WordScorer.scala){ #snip }

*执行命令*

@@snip[代码清单16-4编译命令](../../main/scala/chapter16/withoutmock/RunWordScorerTest.sh){ #snip }

*运行结果*

@@snip[代码清单16-4运行结果](../../main/scala/chapter16/withoutmock/shoutput/RunWordScorerTest.output){ #output }

>UnitTesting/SpellChecker.scala (withmock)

@@snip[代码清单16-5](../../main/scala/chapter16/withmock/SpellChecker.scala){ #snip }

>UnitTesting/WordScorerTest.scala (withmock)

@@snip[代码清单16-6](../../main/scala/chapter16/withmock/WordScorerTest.scala){ #snip }

>UnitTesting/WordScorer.scala (withmock)

@@snip[代码清单16-7](../../main/scala/chapter16/withmock/WordScorer.scala){ #snip }

*执行命令*

@@snip[代码清单16-7编译命令](../../main/scala/chapter16/withmock/RunWordScorerTest.sh){ #snip }

*运行结果*

@@snip[代码清单16-7运行结果](../../main/scala/chapter16/withmock/shoutput/RunWordScorerTest.output){ #output }

>UnitTesting/WordScorerTest.scala (withmock2)

@@snip[代码清单16-8](../../main/scala/chapter16/withmock2/WordScorerTest.scala){ #snip }

>UnitTesting/WordScorer.scala (withmock2)

@@snip[代码清单16-9](../../main/scala/chapter16/withmock2/WordScorer.scala){ #snip }

*运行结果*

@@snip[代码清单16-9运行结果](../../main/scala/chapter16/withmock2/shoutput/RunWordScorerTest.output){ #output }

