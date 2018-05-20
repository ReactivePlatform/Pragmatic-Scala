# 第12章——惰性求值和并行集合

即时响应性是一项决定任何应用程序成败的关键因素。其他因素，如商业价值、易用性、 可用性、成本以及回弹性，也很重要，但是即时响应性是最重要的—我们人类大约需要 250 ms 来感知任何的移动，超过 5 s 的延迟就变得不可接受了。任何可以降低响应时间的努力都会 产生巨大的影响，能够使客户更加满意，进而赢得他们的信任。

## 12.1 释放惰性

>Parallel/ShortCircuit.scala

@@snip[代码清单12-1](../../main/scala/chapter12/ShortCircuit.scala){ #snip }

*运行结果*

@@snip[代码清单12-1运行结果](../../main/scala/chapter12/output/shortCircuit.output){ #snip_12-1_output }

>Parallel/Eager.scala

@@snip[代码清单12-2](../../main/scala/chapter12/Eager.scala){ #snip }

*运行结果*

@@snip[代码清单12-2运行结果](../../main/scala/chapter12/output/eager.output){ #snip_12-2_output }

>Parallel/Eager.scala

@@snip[代码清单12-3](../../main/scala/chapter12/Lazy.scala){ #snip }

*运行结果*

@@snip[代码清单12-3运行结果](../../main/scala/chapter12/output/lazy.output){ #snip_12-3_output }

>Parallel/LazyOrder.scala

@@snip[代码清单12-4](../../main/scala/chapter12/LazyOrder.scala){ #snip }

*运行结果*

@@snip[代码清单12-4运行结果](../../main/scala/chapter12/output/lazyOrder.output){ #snip_12-4_output }

## 12.2 释放严格集合的惰性

>Parallel/StrictCollection.scala

@@snip[代码清单12-5](../../main/scala/chapter12/StrictCollection.scala){ #snip }

*运行结果*

@@snip[代码清单12-5运行结果](../../main/scala/chapter12/output/strictCollection.output){ #snip_12-5_output }

>Parallel/LazyCollection.scala

@@snip[代码清单12-6](../../main/scala/chapter12/LazyCollection.scala){ #snip }

*运行结果*

@@snip[代码清单12-6运行结果](../../main/scala/chapter12/output/lazyCollection.output){ #snip_12-6_output }

## 12.3 终极惰性流

>Parallel/NumberGenerator.scala

@@snip[代码清单12-7](../../main/scala/chapter12/NumberGenerator.scala){ #snip }

*运行结果*

@@snip[代码清单12-7运行结果](../../main/scala/chapter12/output/numberGenerator.output){ #snip_12-7_output }

>Parallel/NumberGenerator.scala

@@snip[代码清单12-8](../../main/scala/chapter12/NumberGenerator.scala){ #snip_12-8 }

*运行结果*

@@snip[代码清单12-8运行结果](../../main/scala/chapter12/output/numberGenerator.output){ #snip_12-8_output }

>Parallel/NumberGenerator.scala

@@snip[代码清单12-9](../../main/scala/chapter12/NumberGenerator.scala){ #snip_12-9 }

*运行结果*

@@snip[代码清单12-9运行结果](../../main/scala/chapter12/output/numberGenerator.output){ #snip_12-9_output }

>Parallel/Primes.scala

@@snip[代码清单12-10](../../main/scala/chapter12/Primes.scala){ #snip_12-10 }

>Parallel/Primes.scala

@@snip[代码清单12-11](../../main/scala/chapter12/Primes.scala){ #snip_12-11 }

*运行结果*

@@snip[代码清单12-11运行结果](../../main/scala/chapter12/output/primes.output){ #snip_12-11_output }

## 12.4 并行集合

>Parallel/Weather.scala

@@snip[代码清单12-12](../../main/scala/chapter12/Weather.scala){ #snip_12-12 }

>Parallel/Weather.scala

@@snip[代码清单12-13](../../main/scala/chapter12/Weather.scala){ #snip_12-13 }

>Parallel/Weather.scala

@@snip[代码清单12-14](../../main/scala/chapter12/Weather.scala){ #snip_12-14 }

>Parallel/Weather.scala

@@snip[代码清单12-15](../../main/scala/chapter12/Weather.scala){ #snip_12-15 }

*运行结果*

@@snip[代码清单12-15运行结果](../../main/scala/chapter12/output/weather.output){ #snip_12-15_output }

>Parallel/Weather.scala

@@snip[代码清单12-16](../../main/scala/chapter12/Weather.scala){ #snip_12-16 }

*运行结果*

@@snip[代码清单12-15运行结果](../../main/scala/chapter12/output/weather.output){ #snip_12-16_output }