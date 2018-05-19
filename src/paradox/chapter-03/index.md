# 第3章——从Java到Scala

你可以在使用 Scala 的同时运用自己的 Java 技能。在某些方面 Scala 与 Java 类似，但在 许多其他方面又彼此不同。Scala 青睐纯面向对象，但它又尽可能将类型和 Java 的类型对应 起来。Scala 在支持熟悉的命令式编程风格的同时，也支持函数式编程风格。因此，你可以使 用最熟悉的风格立即开始编程，而不用承受陡峭的学习曲线。

## 3.1 Scala：简洁的 Java

>FromJavaToScala/Greetings.java

@@snip[代码清单3-1](../../main/scala/chapter3/Greetings.java){ #snip }

*运行结果*

@@snip[代码清单3-1运行结果](../../main/scala/chapter3/output/Greetings.output){ #output }

>FromJavaToScala/Greet.scala

@@snip[代码清单3-2](../../main/scala/chapter3/Greet.scala){ #snip }

*运行结果*

>FromJavaToScala/Greet.scala

@@snip[代码清单3-2运行结果](../../main/scala/chapter3/output/Greet.output){ #output }

>FromJavaToScala/GreetExclusiveUpper.scala

@@snip[代码清单3-3](../../main/scala/chapter3/GreetExclusiveUpper.scala){ #snip }

*运行结果*

@@snip[代码清单3-3运行结果](../../main/scala/chapter3/output/GreetExclusiveUpper.output){ #output }

>FromJavaToScala/GreetForEach.scala

@@snip[代码清单3-4](../../main/scala/chapter3/GreetForEach.scala){ #snip }

*运行结果*

@@snip[代码清单3-4运行结果](../../main/scala/chapter3/output/GreetForEach.output){ #output }

## 3.2 Java 原始类型对应的 Scala 类

>FromJavaToScala/ScalaInt.scala

@@snip[代码清单3-5](../../main/scala/chapter3/ScalaInt.scala){ #snip }

## 3.3 元组和多重赋值

>FromJavaToScala/MultipleAssignment.scala

@@snip[代码清单3-6](../../main/scala/chapter3/MultipleAssignment.scala){ #snip }

*运行结果*

@@snip[代码清单3-6运行结果](../../main/scala/chapter3/output/MultipleAssignment.output){ #output }

>FromJavaToScala/MultipleAssignment2.scala

@@snip[代码清单3-7](../../test/scala/chapter3/MultipleAssignment2.scala){ #snip }

*运行结果*

@@snip[代码清单3-7运行结果](../../main/scala/chapter3/output/RunMultipleAssignment2.output){ #output }

## 3.4 灵活的参数和参数值

>FromJavaToScala/Parameters.scala

@@snip[代码清单3-8](../../main/scala/chapter3/Parameters.scala){ #snip_3-8 }

>FromJavaToScala/Parameters.scala

@@snip[代码清单3-9](../../main/scala/chapter3/Parameters.scala){ #snip_3-9 }

>FromJavaToScala/Parameters.scala

@@snip[代码清单3-10](../../main/scala/chapter3/Parameters.scala){ #snip_3-10 }

>FromJavaToScala/ArgType.scala

@@snip[代码清单3-11](../../main/scala/chapter3/ArgType.scala){ #snip }

*运行结果*

@@snip[代码清单3-11运行结果](../../main/scala/chapter3/output/ArgType.output){ #output }

>FromJavaToScala/CantSendArray.scala

@@snip[代码清单3-12](../../test/scala/chapter3/CantSendArray.scala){ #snip }

*运行结果*

@@snip[代码清单3-12运行结果](../../main/scala/chapter3/output/RunCantSendArray.output){ #output }

>FromJavaToScala/Parameters.scala

@@snip[代码清单3-13](../../main/scala/chapter3/Parameters.scala){ #snip_3-13 }

>FromJavaToScala/DefaultValues.scala

@@snip[代码清单3-14](../../main/scala/chapter3/DefaultValues.scala){ #snip_3-14 }

>FromJavaToScala/DefaultValues.scala

@@snip[代码清单3-15](../../main/scala/chapter3/DefaultValues.scala){ #snip_3-15 }

*运行结果*

@@snip[代码清单3-15运行结果](../../main/scala/chapter3/output/DefaultValues.output){ #output }

>FromJavaToScala/Named.scala

@@snip[代码清单3-16](../../main/scala/chapter3/Named.scala){ #snip_3-16 }

>FromJavaToScala/Named.scala

@@snip[代码清单3-17](../../main/scala/chapter3/Named.scala){ #snip_3-17 }

## 3.5 隐式参数

>FromJavaToScala/ImplicitParameters.scala

@@snip[代码清单3-18](../../main/scala/chapter3/ImplicitParameters.scala){ #snip }

*运行结果*

@@snip[代码清单3-18运行结果](../../main/scala/chapter3/output/ImplicitParameters.output){ #output }

## 3.6 字符串和多行原始字符串

>FromJavaToScala/MultiLine.scala

@@snip[代码清单3-19](../../main/scala/chapter3/MultiLine.scala){ #snip }

*运行结果*

@@snip[代码清单3-19运行结果](../../main/scala/chapter3/output/MultiLine.output){ #output }

>FromJavaToScala/MultiLine2.scala

@@snip[代码清单3-20](../../main/scala/chapter3/MultiLine2.scala){ #snip }

*运行结果*

@@snip[代码清单3-20运行结果](../../main/scala/chapter3/output/MultiLine2.output){ #output }

>FromJavaToScala/StringInterpolation.scala

@@snip[代码清单3-21](../../main/scala/chapter3/StringInterpolation.scala){ #snip_3-21 }

>FromJavaToScala/StringInterpolation.scala

@@snip[代码清单3-22](../../main/scala/chapter3/StringInterpolation.scala){ #snip_3-22 }

>FromJavaToScala/StringInterpolation.scala

@@snip[代码清单3-23](../../main/scala/chapter3/StringInterpolation.scala){ #snip_3-23 }

>FromJavaToScala/StringInterpolation.scala

@@snip[代码清单3-24](../../main/scala/chapter3/StringInterpolation.scala){ #snip_3-24 }

*运行结果*

@@snip[代码清单3-24运行结果](../../main/scala/chapter3/output/StringInterpolation.output){ #output_3-24 }

>FromJavaToScala/StringInterpolation.scala

@@snip[代码清单3-25](../../main/scala/chapter3/StringInterpolation.scala){ #snip_3-25 }

*运行结果*

@@snip[代码清单3-25运行结果](../../main/scala/chapter3/output/StringInterpolation.output){ #output_3-25 }

## 3.9 操作符重载

>FromJavaToScala/Complex.scala

@@snip[代码清单3-26](../../main/scala/chapter3/Complex.scala){ #snip }

*运行结果*

@@snip[代码清单3-26运行结果](../../main/scala/chapter3/output/Complex.output){ #output }

>FromJavaToScala/Complex2.scala

@@snip[代码清单3-27](../../main/scala/chapter3/Complex2.scala){ #snip }

*运行结果*

@@snip[代码清单3-27运行结果](../../main/scala/chapter3/output/Complex2.output){ #output }

## 3.10 Scala 与 Java 的差异

>FromJavaToScala/SerialAssignments.scala

@@snip[代码清单3-28](../../test/scala/chapter3/SerialAssignments.scala){ #snip }

*运行结果*

@@snip[代码清单3-28运行结果](../../main/scala/chapter3/output/RunSerialAssignments.output){ #output }

>FromJavaToScala/Equality.scala

@@snip[代码清单3-29](../../main/scala/chapter3/Equality.scala){ #snip }

*运行结果*

@@snip[代码清单3-29运行结果](../../main/scala/chapter3/output/Equality.output){ #output }

>FromJavaToScala/OptionalSemicolon.scala

@@snip[代码清单3-30](../../main/scala/chapter3/OptionalSemicolon.scala){ #snip }

*运行结果*

@@snip[代码清单3-30运行结果](../../main/scala/chapter3/output/OptionalSemicolon.output){ #output }

>FromJavaToScala/AvoidExplicitReturn.scala

@@snip[代码清单3-31](../../main/scala/chapter3/AvoidExplitReturn.scala){ #snip }

*运行结果*

@@snip[代码清单3-31运行结果](../../main/scala/chapter3/output/AvoidExplitReturn.output){ #output }

## 3.11 默认访问修饰符

>FromJavaToScala/Access.scala

@@snip[代码清单3-32](../../main/scala/chapter3/Access.scala){ #snip }

*运行结果*

@@snip[代码清单3-32运行结果](../../main/scala/chapter3/output/RunAccess.output){ #output }

>FromJavaToScala/Protected.scala

@@snip[代码清单3-33](../../test/scala/chapter3/Protected.scala){ #snip }

*运行结果*

@@snip[代码清单3-33运行结果](../../main/scala/chapter3/compileroutput/Protected.output){ #output }

>FromJavaToScala/FineGrainedAccessControl.scala

@@snip[代码清单3-34](../../test/scala/chapter3/FineGrainedAccessControl.scala){ #snip }

*运行结果*

@@snip[代码清单3-34运行结果](../../main/scala/chapter3/compileroutput/FineGrainedAccessControl.output){ #output }