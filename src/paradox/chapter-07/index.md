# 第7章——特质

Java 只允许单继承，这会强制建立一种线性的层次结构模型。但现实世界中充满了横切 关注点（crosscutting concerns）—一种横切且影响多个抽象的概念，这些抽象并不同属于 某个单一的类层次结构 ① 。在典型的企业级应用程序中，安全、日志记录、验证、事务以及 资源管理都是这些横切关注点的应用场景。但是，因为我们受限于单一的类层次结构，所以 实现这些横切关注点变得相当困难，往往需要代码上的重复或者引入重量级工具 ② 。Scala 使 用特质（trait）解决了这个问题。

>1. 即横跨应用程序中多个模块的特性。——译者注

## 7.1 理解特质

>UsingTraits/HumanWithListen.scala

@@snip[代码清单7-1](../../main/scala/chapter7/HumanWithListen.scala){ #snip }

>UsingTraits/Friend.scala

@@snip[代码清单7-2](../../main/scala/chapter7/Friend.scala){ #snip }

>UsingTraits/Human.scala

@@snip[代码清单7-3](../../main/scala/chapter7/Human.scala){ #snip }

>UsingTraits/Dog.scala

@@snip[代码清单7-4](../../main/scala/chapter7/Dog.scala){ #snip }

>UsingTraits/Animal.scala

@@snip[代码清单7-5](../../main/scala/chapter7/Animal.scala){ #snip }

>UsingTraits/UseFriend.scala

@@snip[代码清单7-6](../../main/scala/chapter7/UseFriend.scala){ #snip }

*运行结果*

@@snip[代码清单7-6运行结果](../../main/scala/chapter7/shoutput/RunUseFriend.output){ #output }

## 7.2 选择性混入

>UsingTraits/Cat.scala

@@snip[代码清单7-7](../../main/scala/chapter7/Cat.scala){ #snip }

>UsingTraits/UseCat.scala

@@snip[代码清单7-8](../../test/scala/chapter7/UseCat.scala){ #snip }

*编译结果*

@@snip[代码清单7-8编译结果](../../main/scala/chapter7/shoutput/RunUseCat.output){ #output }

>UsingTraits/TreatCatAsFriend.scala

@@snip[代码清单7-9](../../main/scala/chapter7/TreatCatAsFriend.scala){ #snip }

*运行结果*

@@snip[代码清单7-9运行结果](../../main/scala/chapter7/shoutput/RunTreatCatAsFriend.output){ #output }

## 7.3 使用特质实现装饰器模式

>UsingTraits/Decorator.scala

@@snip[代码清单7-10](../../main/scala/chapter7/Decorator.scala){ #snip_1 }

>UsingTraits/Decorator.scala

@@snip[代码清单7-11](../../main/scala/chapter7/Decorator.scala){ #snip_2 }

>UsingTraits/Decorator.scala

@@snip[代码清单7-12](../../main/scala/chapter7/Decorator.scala){ #snip_3 }

>UsingTraits/Decorator.scala

@@snip[代码清单7-13](../../main/scala/chapter7/Decorator.scala){ #snip_4 }

*运行结果*

@@snip[代码清单7-13运行结果](../../main/scala/chapter7/output/Decorator.output){ #output }

## 7.4 特质中的方法延迟绑定

>UsingTraits/MethodBinding.scala

@@snip[代码清单7-14](../../main/scala/chapter7/MethodBinding.scala){ #snip_1 }

>UsingTraits/MethodBinding.scala

@@snip[代码清单7-15](../../main/scala/chapter7/MethodBinding.scala){ #snip_2 }

>UsingTraits/MethodBinding.scala

@@snip[代码清单7-16](../../main/scala/chapter7/MethodBinding.scala){ #snip_3 }

>UsingTraits/MethodBinding.scala

@@snip[代码清单7-17](../../main/scala/chapter7/MethodBinding.scala){ #snip_4 }

*运行结果*

@@snip[代码清单7-17运行结果](../../main/scala/chapter7/output/MethodBinding.output){ #output }