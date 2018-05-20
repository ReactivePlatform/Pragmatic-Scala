# 第4章——善用对象

Scala 是一门完全面向对象的编程语言，为类的创建和对象的处理提供了简洁的语法。 Java 中能做的，在 Scala 中都可以做，Scala 还额外提供了一些更强大的特性，以帮助我们进 行面向对象编程。尽管 Scala 是一门纯面向对象的编程语言，但是它也支持一些 Java 中不是 那么纯粹的面向对象概念，如静态方法 ① 。利用伴生对象，Scala 以一种相当有趣的方式处理 了这个问题。伴生对象是伴随一个类的单例，在 Scala 中非常常见。

## 4.1 创建并使用类

>WorkingWithObjects/Car.java

@@snip[代码清单4-1](../../main/scala/chapter4/Car.java){ #snip }

>WorkingWithObjects/UseCar.scala

@@snip[代码清单4-2](../../main/scala/chapter4/UseCar.scala){ #snip_4-2 }

*运行结果*

@@snip[代码清单4-2运行结果](../../main/scala/chapter4/output/UseCar.output){ #output }

>WorkingWithObjects/CreditCard.scala

@@snip[代码清单4-3](../../main/scala/chapter4/CreditCard.scala){ #snip }

*运行结果*

@@snip[代码清单4-3运行结果](../../main/scala/chapter4/shoutput/RunCreditCard.output){ #output }

>WorkingWithObjects/Construct.scala

@@snip[代码清单4-4](../../main/scala/chapter4/Construct.scala){ #snip }

*运行结果*

@@snip[代码清单4-4运行结果](../../main/scala/chapter4/output/Construct.output){ #output }

>WorkingWithObjects/Person.scala

@@snip[代码清单4-5](../../main/scala/chapter4/Person.scala){ #snip }

*运行结果*

@@snip[代码清单4-5运行结果](../../main/scala/chapter4/output/Person.output){ #output }

*反编译结果*

@@snip[代码清单4-5反编译结果](../../main/scala/chapter4/shoutput/RunPerson.output){ #output }

## 4.2 遵循 JavaBean 惯例

>WorkingWithObjects/Dude.scala

@@snip[代码清单4-6](../../main/scala/chapter4/Dude.scala){ #snip }

*反编译结果*

@@snip[代码清单4-6反编译结果](../../main/scala/chapter4/shoutput/RunDude.output){ #output }

## 4.3 类型别名

>WorkingWithObjects/PoliceOfficer.scala

@@snip[代码清单4-7](../../main/scala/chapter4/PoliceOfficer.scala){ #snip }

>WorkingWithObjects/CopApp.scala

@@snip[代码清单4-8](../../main/scala/chapter4/CopApp.scala){ #snip }

*运行结果*

@@snip[代码清单4-8运行结果](../../main/scala/chapter4/shoutput/RunCopApp.output){ #output }

## 4.4 扩展一个类

>WorkingWithObjects/Vehicle.scala

@@snip[代码清单4-9](../../main/scala/chapter4/Vehicle.scala){ #snip }

*运行结果*

@@snip[代码清单4-9运行结果](../../main/scala/chapter4/output/Vehicle.output){ #output }

## 4.5 参数化类型

>WorkingWithObjects/Parameterized.scala

@@snip[代码清单4-10](../../main/scala/chapter4/Parameterized.scala){ #snip_4-10 }

>WorkingWithObjects/Parameterized.scala

@@snip[代码清单4-11](../../main/scala/chapter4/Parameterized.scala){ #snip_4-11 }

*运行结果*

@@snip[代码清单4-11运行结果](../../main/scala/chapter4/output/Parameterized.output){ #output_4-11 }

>WorkingWithObjects/Parameterized.scala

@@snip[代码清单4-12](../../main/scala/chapter4/Parameterized.scala){ #snip_4-12 }

*运行结果*

@@snip[代码清单4-12运行结果](../../main/scala/chapter4/output/Parameterized.output){ #output_4-12 }

>WorkingWithObjects/EchoErr.scala

@@snip[代码清单4-13](../../test/scala/chapter4/EchoErr.scala){ #snip }

>WorkingWithObjects/Parameterized.scala

@@snip[代码清单4-14](../../main/scala/chapter4/Parameterized.scala){ #snip_4-14 }

>WorkingWithObjects/Parameterized.scala

@@snip[代码清单4-15](../../main/scala/chapter4/Parameterized.scala){ #snip_4-15 }

>WorkingWithObjects/Parameterized.scala

@@snip[代码清单4-16](../../main/scala/chapter4/Parameterized.scala){ #snip_4-16 }

*运行结果*

@@snip[代码清单4-16运行结果](../../main/scala/chapter4/output/Parameterized.output){ #output_4-16 }

>WorkingWithObjects/Message.scala

@@snip[代码清单4-17](../../test/scala/chapter4/Message.scala){ #snip_4-17 }

>WorkingWithObjects/Message.scala

@@snip[代码清单4-18](../../test/scala/chapter4/Message.scala){ #snip_4-18 }

## 4.6 单例对象和伴生对象

>WorkingWithObjects/Singleton.scala

@@snip[代码清单4-19](../../main/scala/chapter4/Singleton.scala){ #snip }

*运行结果*

@@snip[代码清单4-19运行结果](../../main/scala/chapter4/output/Singleton.output){ #output }

>WorkingWithObjects/Marker.scala

@@snip[代码清单4-20](../../main/scala/chapter4/Marker.scala){ #snip }

*运行结果*

@@snip[代码清单4-20运行结果](../../main/scala/chapter4/output/Marker.output){ #output }

>WorkingWithObjects/Static.scala

@@snip[代码清单4-21](../../main/scala/chapter4/Static.scala){ #snip }

*运行结果*

@@snip[代码清单4-21运行结果](../../main/scala/chapter4/output/Marker.output){ #output }

>WorkingWithObjects/Greeter.scala

@@snip[代码清单4-22](../../main/scala/chapter4/Greeter.scala){ #snip }

*运行结果*

@@snip[代码清单4-22反编译结果](../../main/scala/chapter4/shoutput/RunGreeter.output){ #output }

## 4.7 创建枚举类

>WorkingWithObjects/Currency.scala

@@snip[代码清单4-23](../../main/scala/chapter4/finance1/finance/currencies/Currency.scala){ #snip }

>WorkingWithObjects/finance1/finance/currencies/Money.scala

@@snip[代码清单4-24](../../main/scala/chapter4/finance1/finance/currencies/Money.scala){ #snip }

>WorkingWithObjects/UseCurrency.scala

@@snip[代码清单4-25](../../main/scala/chapter4/UseCurrency.scala){ #snip }

*运行结果*

@@snip[代码清单4-25运行结果](../../main/scala/chapter4/shoutput/RunUseCurrency.output){ #output }

## 4.8 包对象

>WorkingWithObjects/finance1/finance/currencies/Converter.scala

@@snip[代码清单4-26](../../main/scala/chapter4/finance1/finance/currencies/Converter.scala){ #snip }

>WorkingWithObjects/finance1/finance/currencies/Charge.scala

@@snip[代码清单4-27](../../main/scala/chapter4/finance1/finance/currencies/Charge.scala){ #snip }

>WorkingWithObjects/finance1/CurrencyApp.scala

@@snip[代码清单4-28](../../main/scala/chapter4/finance1/CurrencyApp.scala){ #snip }

>WorkingWithObjects/finance2/finance/currencies/package.scala

@@snip[代码清单4-29](../../main/scala/chapter4/finance2/finance/currencies/package.scala){ #snip }

>WorkingWithObjects/finance2/finance/currencies/Charge.scala

@@snip[代码清单4-30](../../main/scala/chapter4/finance2/finance/currencies/Charge.scala){ #snip }

>WorkingWithObjects/finance2/CurrencyApp.scala

@@snip[代码清单4-30](../../main/scala/chapter4/finance2/CurrencyApp.scala){ #snip }

*运行结果*

@@snip[代码清单4-29运行结果](../../main/scala/chapter4/shoutput/RunUseCurrency.output){ #output }