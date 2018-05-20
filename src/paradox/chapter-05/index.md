# 第5章——善用类型

Scala 的关键优点之一便是 Scala 是静态类型的。通过静态类型，编译器充当了抵御错误 的第一道防线。它们可以验证当前的对象是否就是想要的类型。这是一种在编译时强制接口 约定的方式。这样的验证可以使我们相信，编译后的代码满足我们的预期。

## 5.1 类型推断

>MakingUseOfTypes/DefiningVariableWithType.scala

@@snip[代码清单5-1](../../main/scala/chapter5/DefiningVariableWithType.scala){ #snip }

>MakingUseOfTypes/DefiningVariable.scala

@@snip[代码清单5-2](../../main/scala/chapter5/DefiningVariable.scala){ #snip_5-2 }

>MakingUseOfTypes/DefiningVariable.scala

@@snip[代码清单5-3](../../main/scala/chapter5/DefiningVariable.scala){ #snip_5-3 }

*运行结果*

@@snip[代码清单5-3运行结果](../../main/scala/chapter5/output/DefiningVariable.output){ #output }

>MakingUseOfTypes/TypeInference.scala

@@snip[代码清单5-4](../../main/scala/chapter5/TypeInference.scala){ #snip }

*使用命令*

@@snip[代码清单5-4编译命令](../../main/scala/chapter5/RunTypeInference.sh){ #snip }

*反编译结果*

@@snip[代码清单5-4反编译结果](../../main/scala/chapter5/shoutput/RunTypeInference.output){ #output }

*REPL运行结果*

@@snip[代码清单5-4 REPL运行结果](../../main/scala/chapter5/shoutput/RunREPL.output){ #output }

>MakingUseOfTypes/Generics.scala

@@snip[代码清单5-5](../../main/scala/chapter5/Generics.scala){ #snip }

>MakingUseOfTypes/Generics2.scala

@@snip[代码清单5-6](../../test/scala/chapter5/Generics2.scala){ #snip }

*运行结果*

@@snip[代码清单5-6运行结果](../../main/scala/chapter5/output/RunGenerics2.output){ #output }

>MakingUseOfTypes/Generics3.scala

@@snip[代码清单5-7](../../test/scala/chapter5/Generics3.scala){ #snip }

*运行结果*

@@snip[代码清单5-7运行结果](../../main/scala/chapter5/output/RunGenerics3.output){ #output }

## 5.2 基础类型

>MakingUseOfTypes/ExceptionThrowing.scala

@@snip[代码清单5-8](../../main/scala/chapter5/ExceptionThrowing.scala){ #snip }

*运行结果*

@@snip[代码清单5-9](../../main/scala/chapter5/shoutput/RunMethodType.output){ #output }

>MakingUseOfTypes/OptionExample.scala

@@snip[代码清单5-10](../../main/scala/chapter5/OptionExample.scala){ #snip }

*运行结果*

@@snip[代码清单5-10运行结果](../../main/scala/chapter5/output/OptionExample.output){ #output }

>MakingUseOfTypes/UsingEither.scala

@@snip[代码清单5-11](../../main/scala/chapter5/UsingEither.scala){ #snip_5-11 }

>MakingUseOfTypes/UsingEither.scala

@@snip[代码清单5-12](../../main/scala/chapter5/UsingEither.scala){ #snip_5-12 }

>MakingUseOfTypes/UsingEither.scala

@@snip[代码清单5-13](../../main/scala/chapter5/UsingEither.scala){ #snip_5-13 }

*运行结果*

@@snip[代码清单5-13运行结果](../../main/scala/chapter5/output/UsingEither.output){ #output }

## 5.3 返回值类型推断

>MakingUseOfTypes/Functions.scala

@@snip[代码清单5-14](../../main/scala/chapter5/Functions.scala){ #snip }

*运行结果*

@@snip[代码清单5-14运行结果](../../main/scala/chapter5/shoutput/RunFunctionReturnTypes.output){ #output }

>MakingUseOfTypes/NotAllowed.scala

@@snip[代码清单5-15](../../test/scala/chapter5/NotAllowed.scala){ #snip }

*运行结果*

@@snip[代码清单5-15运行结果](../../main/scala/chapter5/output/RunNotAllowed.output){ #output }


## 5.4 参数化类型的型变

>MakingUseOfTypes/Trouble.java

@@snip[代码清单5-16](../../main/scala/chapter5/Trouble.java){ #snip }

*运行结果*

@@snip[代码清单5-16运行结果](../../main/scala/chapter5/output/Trouble.output){ #output }

>MakingUseOfTypes/OKJava.java

@@snip[代码清单5-17](../../test/java/chapter5/OKJava.java){ #snip }

*绕开限制*

@@snip[代码清单5-17](../../test/java/chapter5/OKJava.java){ #snip_1 }

*运行结果*

@@snip[代码清单5-17运行结果](../../main/scala/chapter5/compileroutput/OKJava.output){ #output }

@@snip[代码清单5-18](../../main/scala/chapter5/PlayWithPets.scala){ #snip_5-18 }

>MakingUseOfTypes/PlayWithPets.scala

@@snip[代码清单5-19](../../main/scala/chapter5/PlayWithPets.scala){ #snip_5-19 }

>MakingUseOfTypes/PlayWithPets.scala

@@snip[代码清单5-20](../../main/scala/chapter5/PlayWithPets.scala){ #snip_5-20 }

>MakingUseOfTypes/PlayWithPets.scala

@@snip[代码清单5-21](../../main/scala/chapter5/PlayWithPets.scala){ #snip_5-21 }

*运行结果*

@@snip[代码清单5-21运行结果](../../main/scala/chapter5/output/PlayWithPets.output){ #output }

>MakingUseOfTypes/PlayWithPets.scala

@@snip[代码清单5-22](../../main/scala/chapter5/PlayWithPets.scala){ #snip_5-22 }

>MakingUseOfTypes/MyList.scala

@@snip[代码清单5-23](../../main/scala/chapter5/MyList.scala){ #snip }

## 5.5 隐式类型转换

>MakingUseOfTypes/DateHelper1.scala

@@snip[代码清单5-24](../../main/scala/chapter5/DateHelper1.scala){ #snip_5-24 }

>MakingUseOfTypes/DateHelper1.scala

@@snip[代码清单5-25](../../main/scala/chapter5/DateHelper1.scala){ #snip_5-25 }

*运行结果*

@@snip[代码清单5-25运行结果](../../main/scala/chapter5/output/DateHelper1.output){ #output }

>MakingUseOfTypes/DateHelper.scala

@@snip[代码清单5-26](../../main/scala/chapter5/DateHelper.scala){ #snip }

>MakingUseOfTypes/DaysDSL.scala

@@snip[代码清单5-27](../../main/scala/chapter5/DaysDSL.scala){ #snip }

*运行结果*

@@snip[代码清单5-27运行结果](../../main/scala/chapter5/shoutput/RunDaysDSL.output){ #output }

>MakingUseOfTypes/DateUtil.scala

@@snip[代码清单5-28](../../main/scala/chapter5/DateUtil.scala){ #snip_5-28 }

>MakingUseOfTypes/DateUtil.scala

@@snip[代码清单5-29](../../main/scala/chapter5/DateUtil.scala){ #snip_5-29 }

*运行结果*

@@snip[代码清单5-30](../../main/scala/chapter5/shoutput/CompileDateUtil.output){ #output }

## 5.6 值类

>MakingUseOfTypes/ValDateUtil.scala

@@snip[代码清单5-31](../../main/scala/chapter5/ValDateUtil.scala){ #snip }

*反编译结果*

@@snip[代码清单5-31的反编译结果](../../main/scala/chapter5/shoutput/CompileValDateUtil.output){ #output }

>MakingUseOfTypes/NameExample.scala

@@snip[代码清单5-32](../../main/scala/chapter5/NameExample.scala){ #snip }

*反编译结果*

@@snip[代码清单5-32的反编译结果](../../main/scala/chapter5/shoutput/CompileNameExample.output){ #output }

>MakingUseOfTypes/NameValExample.scala

@@snip[代码清单5-33](../../main/scala/chapter5/NameValExample.scala){ #snip }

*反编译结果*

@@snip[代码清单5-33的反编译结果](../../main/scala/chapter5/shoutput/CompileNameValExample.output){ #output }

>MakingUseOfTypes/NameVal2Example.scala

@@snip[代码清单5-34](../../main/scala/chapter5/NameVal2Example.scala){ #snip }

## 5.7 使用隐式转换

>MakingUseOfTypes/Mask.scala

@@snip[代码清单5-35](../../main/scala/chapter5/Mask.scala){ #snip }

>MakingUseOfTypes/MyInterpolator.scala

@@snip[代码清单5-36](../../main/scala/chapter5/MyInterpolator.scala){ #snip }

*使用命令*

@@snip[代码清单5-36编译命令](../../main/scala/chapter5/RunMask.sh){ #snip }

*运行结果*

@@snip[代码清单5-36运行结果](../../main/scala/chapter5/shoutput/RunMask.output){ #output }