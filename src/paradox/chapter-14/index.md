# 第14章——和Java进行互操作

现已存在许多强大的 Scala 库，并与日俱增。开发人员不仅可以在 Scala 中使用这些库， 也可以在 Java 中使用它们。但是要做到这一点，必须要学习一些技巧。 ①

>1. 因为某些库可能没有针对潜在的 Java 用户设计友好的 API，所以可能需要一些潜在适配工作。——译者注

## 14.1 在 Scala 中使用 Scala 类

>Intermixing/Person.scala

@@snip[代码清单14-1](../../main/scala/chapter14/Person.scala){ #snip }

>Intermixing/Dog.scala

@@snip[代码清单14-2](../../main/scala/chapter14/Dog.scala){ #snip }

*执行命令*

@@snip[代码清单14-2运行命令](../../main/scala/chapter14/CompileAndCreateJar.sh){ #snip }

>Intermixing/UsePerson.scala

@@snip[代码清单14-3](../../main/scala/chapter14/UsePerson.scala){ #snip }

*执行命令*

@@snip[代码清单14-3运行命令](../../main/scala/chapter14/RunUsePerson.sh){ #snip }

*运行结果*

@@snip[代码清单14-3运行结果](../../main/scala/chapter14/shoutput/RunUsePerson.output){ #snip_14-3_output }

>Intermixing/UsePersonClass.scala

@@snip[代码清单14-4](../../main/scala/chapter14/UsePersonClass.scala){ #snip }

*执行命令1*

@@snip[代码清单14-4运行命令](../../main/scala/chapter14/RunUsePersonClass.sh){ #snip_1 }

*执行命令2*

@@snip[代码清单14-4运行命令](../../main/scala/chapter14/RunUsePersonClass.sh){ #snip_2 }

*执行命令3*

@@snip[代码清单14-4运行命令](../../main/scala/chapter14/RunUsePersonClassUsingJava.sh){ #snip }

*运行结果*

@@snip[代码清单14-4运行结果](../../main/scala/chapter14/shoutput/RunUsePersonClass.output){ #snip_14-4_output }

## 14.2 在 Scala 中使用 Java 类

>Intermixing/UseJDKClass.scala

@@snip[代码清单14-5](../../main/scala/chapter14/UseJDKClass.scala){ #snip }

*执行命令*

@@snip[代码清单14-5运行命令](../../main/scala/chapter14/RunUseJDKClass.sh){ #snip }

*运行结果*

@@snip[代码清单14-5运行结果](../../main/scala/chapter14/shoutput/RunUseJDKClass.output){ #snip_14-5_output }

>Intermixing/java/InvestmentType.java

@@snip[代码清单14-6](../../main/scala/chapter14/usingjava/InvestmentType.java){ #snip }

*运行结果*

@@snip[代码清单14-6运行结果](../../main/scala/chapter14/shoutput/RunUseInvestment.output){ #snip_14-6_output }

>Intermixing/java/Investment.java

@@snip[代码清单14-7](../../main/scala/chapter14/usingjava/Investment.java){ #snip }

>Intermixing/UseInvestment.scala

@@snip[代码清单14-8](../../main/scala/chapter14/UseInvestment.scala){ #snip }

*执行命令1*

@@snip[代码清单14-8运行命令](../../main/scala/chapter14/RunUseInvestment.sh){ #snip }

*执行命令2*

@@snip[代码清单14-8运行命令](../../main/scala/chapter14/RunUseInvestment2.sh){ #snip }

>Intermixing/UseInvestmentError.scala

@@snip[代码清单14-9](../../test/scala/chapter14/UseInvestmentError.scala){ #snip }

>Intermixing/UseInvestmentYield.scala

@@snip[代码清单14-10](../../main/scala/chapter14/UseInvestmentYield.scala){ #snip }

## 14.3 在 Java 中使用 Scala 方法

>Intermixing/Car.scala

@@snip[代码清单14-11](../../main/scala/chapter14/Car.scala){ #snip }

>Intermixing/UseCar.java

@@snip[代码清单14-12](../../main/scala/chapter14/UseCar.java){ #snip }

*执行命令*

@@snip[代码清单14-12运行命令](../../main/scala/chapter14/RunUseCar.sh){ #snip }

## 14.4 在 Java 中使用特质

>Intermixing/Writable.scala

@@snip[代码清单14-13](../../main/scala/chapter14/Writable.scala){ #snip }

>Intermixing/AWritableJavaClass.java

@@snip[代码清单14-14](../../main/scala/chapter14/AWritableJavaClass.java){ #snip }

>Intermixing/Printable.scala

@@snip[代码清单14-15](../../main/scala/chapter14/Printable.scala){ #snip }

*执行命令1*

@@snip[代码清单14-15运行命令](../../main/scala/chapter14/CompileAPrintable.sh){ #snip_1 }

*执行命令2*

@@snip[代码清单14-15运行命令](../../main/scala/chapter14/CompileAPrintable.sh){ #snip_2 }

*运行结果*

@@snip[代码清单14-15运行结果](../../main/scala/chapter14/shoutput/CompileAPrintable.output){ #snip_14-15_output }

>Intermixing/APrintable.java

@@snip[代码清单14-16](../../main/scala/chapter14/APrintable.java){ #snip }

*执行命令*

@@snip[代码清单14-16运行命令](../../main/scala/chapter14/CompileAPrintable.sh){ #snip_3 }

*运行结果*

@@snip[代码清单14-16运行结果](../../main/scala/chapter14/shoutput/CompileAPrintable.output){ #snip_14-16_output }

## 14.5 在 Java 中使用单例对象和伴生对象

>Intermixing/Single.scala

@@snip[代码清单14-17](../../main/scala/chapter14/Single.scala){ #snip }

>Intermixing/SingleUser.java

@@snip[代码清单14-18](../../main/scala/chapter14/SingleUser.java){ #snip }

*运行结果*

@@snip[代码清单14-18运行结果](../../main/scala/chapter14/shoutput/RunSingle.output){ #output }

>Intermixing/Buddy.scala

@@snip[代码清单14-19](../../main/scala/chapter14/Buddy.scala){ #snip }

>Intermixing/BuddyUser.scala

@@snip[代码清单14-20](../../main/scala/chapter14/BuddyUser.java){ #snip }

*运行结果*

@@snip[代码清单14-20运行结果](../../main/scala/chapter14/shoutput/RunBuddy.output){ #snip_14-20_output }

## 14.6 扩展类

>Intermixing/BirdWithProblem.scala

@@snip[代码清单14-21](../../main/scala/chapter14/BirdWithProblem.scala){ #snip }

>Intermixing/Ostrich.scala

@@snip[代码清单14-22](../../main/scala/chapter14/Ostrich.scala){ #snip }

>Intermixing/NoFlyException.scala

@@snip[代码清单14-23](../../main/scala/chapter14/NoFlyException.scala){ #snip }

>Intermixing/Penguin.java

@@snip[代码清单14-24](../../main/scala/chapter14/Penguin.java){ #snip }

@@snip[代码清单14-24运行结果](../../main/scala/chapter14/shoutput/RunBirdWithProblem.output){ #snip_14-24_output }

>Intermixing/Bird.scala

@@snip[代码清单14-25](../../main/scala/chapter14/Bird.scala){ #snip }