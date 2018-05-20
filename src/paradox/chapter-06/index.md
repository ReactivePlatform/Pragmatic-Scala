# 第6章——函数值和闭包

在函数式编程中，函数是一等公民。函数可以作为参数值传入其他函数中，函数的返回值可 以是函数，函数甚至可以嵌套函数。这些高阶函数在 Scala 中被称为函数值（function value）。闭 包（closure）是函数值的特殊形式，会捕获或者绑定到在另一个作用域或上下文中定义的变量。

## 6.1 常规函数的局限性

>FunctionValuesAndClosures/Sum.scala

@@snip[代码清单6-1](../../main/scala/chapter6/Sum.scala){ #snip }

## 6.2 可扩展性与高阶函数

>FunctionValuesAndClosures/Loop.scala

@@snip[代码清单6-2](../../main/scala/chapter6/Loop.scala){ #snip_6-2 }

>FunctionValuesAndClosures/Loop.scala

@@snip[代码清单6-3](../../main/scala/chapter6/Loop.scala){ #snip_6-3 }

>FunctionValuesAndClosures/Loop.scala

@@snip[代码清单6-4](../../main/scala/chapter6/Loop.scala){ #snip_6-4 }

>FunctionValuesAndClosures/Loop.scala

@@snip[代码清单6-5](../../main/scala/chapter6/Loop.scala){ #snip_6-5 }

## 6.3 具有多个参数的函数值

>FunctionValuesAndClosures/ZeroParam.scala

@@snip[代码清单6-6](../../main/scala/chapter6/ZeroParam.scala){ #snip }

>FunctionValuesAndClosures/Inject.scala

@@snip[代码清单6-7](../../main/scala/chapter6/Inject.scala){ #snip_6-7 }

>FunctionValuesAndClosures/Inject.scala

@@snip[代码清单6-8](../../main/scala/chapter6/Inject.scala){ #snip_6-8 }

>FunctionValuesAndClosures/Inject.scala

@@snip[代码清单6-9](../../main/scala/chapter6/Inject.scala){ #snip_6-9 }

*运行结果*

@@snip[代码清单6-9运行结果](../../main/scala/chapter6/output/Inject.output){ #output }

>FunctionValuesAndClosures/Inject2.scala

@@snip[代码清单6-10](../../main/scala/chapter6/Inject2.scala){ #snip_6-10 }

>FunctionValuesAndClosures/Inject2.scala

@@snip[代码清单6-11](../../main/scala/chapter6/Inject2.scala){ #snip_6-11 }

>FunctionValuesAndClosures/Inject3.scala

@@snip[代码清单6-12](../../test/scala/chapter6/Inject3.scala){ #snip }

*运行结果*

@@snip[代码清单6-12运行结果](../../main/scala/chapter6/output/RunInject3.output){ #output }

## 6.4 柯里化

@@snip[代码清单6-13](../../main/scala/chapter6/shoutput/RunMultipleParamsREPL.output){ #snip }

>FunctionValuesAndClosures/Inject4.scala

@@snip[代码清单6-14](../../main/scala/chapter6/Inject4.scala){ #snip_6-14 }

>FunctionValuesAndClosures/Inject4.scala

@@snip[代码清单6-15](../../main/scala/chapter6/Inject4.scala){ #snip_6-15 }

## 6.5 参数的占位符

>FunctionValuesAndClosures/Underscore.scala

@@snip[代码清单6-16](../../main/scala/chapter6/Underscore.scala){ #snip_6-16 }

>FunctionValuesAndClosures/Underscore.scala

@@snip[代码清单6-17](../../main/scala/chapter6/Underscore.scala){ #snip_6-17 }

>FunctionValuesAndClosures/Underscore.scala

@@snip[代码清单6-18](../../main/scala/chapter6/Underscore.scala){ #snip_6-18 }

## 6.6 参数路由

>FunctionValuesAndClosures/RouteParams.scala

@@snip[代码清单6-19](../../main/scala/chapter6/RouteParams.scala){ #snip_6-19 }

>FunctionValuesAndClosures/RouteParams.scala

@@snip[代码清单6-20](../../main/scala/chapter6/RouteParams.scala){ #snip_6-20 }

>FunctionValuesAndClosures/RouteParams.scala

@@snip[代码清单6-21](../../main/scala/chapter6/RouteParams.scala){ #snip_6-21 }

>FunctionValuesAndClosures/RouteParams.scala

@@snip[代码清单6-22](../../main/scala/chapter6/RouteParams.scala){ #snip_6-22 }

## 6.7 复用函数值

>FunctionValuesAndClosures/Equipment.scala

@@snip[代码清单6-23](../../main/scala/chapter6/Equipment.scala){ #snip_6-23 }

>FunctionValuesAndClosures/EquipmentUseNotDry.scala

@@snip[代码清单6-24](../../main/scala/chapter6/EquipmentUseNotDry.scala){ #snip_6-24 }

*运行结果*

@@snip[代码清单6-24运行结果](../../main/scala/chapter6/shoutput/RunEquipmentUseNotDry.output){ #output }

>FunctionValuesAndClosures/EquipmentUseNotDry.scala

@@snip[代码清单6-25](../../main/scala/chapter6/EquipmentUseDry.scala){ #snip }

*运行结果*

@@snip[代码清单6-25运行结果](../../main/scala/chapter6/shoutput/RunEquipmentUseDry.output){ #output }

>FunctionValuesAndClosures/EquipmentUseNotDry2.scala

@@snip[代码清单6-26](../../main/scala/chapter6/EquipmentUseDry2.scala){ #snip }

*运行结果*

@@snip[代码清单6-26运行结果](../../main/scala/chapter6/shoutput/RunEquipmentUseDry2.output){ #output }
   
## 6.8 部分应用函数

>FunctionValuesAndClosures/Log.scala

@@snip[代码清单6-27](../../main/scala/chapter6/Log.scala){ #snip_6-27 }

>FunctionValuesAndClosures/Log.scala

@@snip[代码清单6-28](../../main/scala/chapter6/Log.scala){ #snip_6-28 }

*运行结果*

@@snip[代码清单6-28运行结果](../../main/scala/chapter6/shoutput/RunREPL.output){ #output }

## 6.9 闭包

>FunctionValuesAndClosures/Closure.scala

@@snip[代码清单6-29](../../main/scala/chapter6/Closure.scala){ #snip_6-29 }

>FunctionValuesAndClosures/Closure.scala

@@snip[代码清单6-30](../../main/scala/chapter6/Closure.scala){ #snip_6-30 }

>FunctionValuesAndClosures/Closure.scala

@@snip[代码清单6-31](../../main/scala/chapter6/Closure.scala){ #snip_6-31 }

>FunctionValuesAndClosures/Closure.scala

@@snip[代码清单6-32](../../main/scala/chapter6/Closure.scala){ #snip_6-32 }

*运行结果*

@@snip[代码清单6-32运行结果](../../main/scala/chapter6/output/Closure.output){ #output }

## 6.10 Execute Around Method 模式

>FunctionValuesAndClosures/Resource.scala

@@snip[代码清单6-33](../../main/scala/chapter6/Resource.scala){ #snip_6-33 }

>FunctionValuesAndClosures/Resource.scala

@@snip[代码清单6-34](../../main/scala/chapter6/Resource.scala){ #snip_6-34 }

*运行结果*

@@snip[代码清单6-34运行结果](../../main/scala/chapter6/output/Resource.output){ #output }

>FunctionValuesAndClosures/WriteToFile.scala

@@snip[代码清单6-35](../../main/scala/chapter6/WriteToFile.scala){ #snip_6-35 }

>FunctionValuesAndClosures/WriteToFile.scala

@@snip[代码清单6-36](../../main/scala/chapter6/WriteToFile.scala){ #snip_6-36 }

*运行结果*

@@snip[代码清单6-36运行结果](../../main/scala/chapter6/output/output.txt){ #output }