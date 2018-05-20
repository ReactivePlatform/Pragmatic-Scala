# 第13章——使用Actor编程

在编写复杂、耗时的应用程序时，我们经常会使用多线程以及并发来降低响应时间或者 提高性能。可惜，传统的并发解决方案导致了一些问题，如线程安全、竞态条件、死锁、活 锁以及不容易理解的、容易出错的代码。共享的可变性是罪魁祸首。

## 13.1 一个顺序耗时问题

>ProgrammingActors/CountFilesSequential.scala

@@snip[代码清单13-1](../../main/scala/chapter13/CountFilesSequential.scala){ #snip }

*执行命令*

@@snip[代码清单13-1运行命名](../../main/scala/chapter13/RunCountFilesSequential.sh){ #snip }

*运行结果*

@@snip[代码清单13-1运行结果](../../main/scala/chapter13/shoutput/RunCountFilesSequential.output){ #output }

## 13.3 创建 Actor

>ProgrammingActors/HollywoodActor.scala

@@snip[代码清单13-2](../../main/scala/chapter13/HollywoodActor.scala){ #snip }

*执行命令——编译*

@@snip[代码清单13-2运行命名](../../main/scala/chapter13/RunCreateActors.sh){ #snip }

*执行命令——执行*

@@snip[代码清单13-2运行命名](../../main/scala/chapter13/RunCreateActors.sh){ #snip-run }

>ProgrammingActors/CreateActors.scala

@@snip[代码清单13-3](../../main/scala/chapter13/CreateActors.scala){ #snip }

*运行结果*

@@snip[代码清单13-3运行结果](../../main/scala/chapter13/shoutput/RunCreateActors.output){ #output }

>ProgrammingActors/HollywoodActor2.scala

@@snip[代码清单13-4](../../main/scala/chapter13/HollywoodActor2.scala){ #snip }

>ProgrammingActors/CreateActors2.scala

@@snip[代码清单13-5](../../main/scala/chapter13/CreateActors2.scala){ #snip }

*运行结果*

@@snip[代码清单13-5运行结果](../../main/scala/chapter13/shoutput/RunCreateActors2.output){ #output }

## 13.4 Actor 和线程

>ProgrammingActors/CreateActors3.scala

@@snip[代码清单13-6](../../main/scala/chapter13/CreateActors3.scala){ #snip }

*运行结果*

@@snip[代码清单13-6运行结果](../../main/scala/chapter13/shoutput/RunCreateActors3.output){ #output }

## 13.5 隔离可变性

>ProgrammingActors/HollywoodActor4.scala

@@snip[代码清单13-7](../../main/scala/chapter13/HollywoodActor4.scala){ #snip }

>ProgrammingActors/UseActor.scala

@@snip[代码清单13-8](../../main/scala/chapter13/UseActor.scala){ #snip }

*运行结果*

@@snip[代码清单13-8运行结果](../../main/scala/chapter13/shoutput/RunUseActor.output){ #output }

## 13.6 使用 Actor 模型进行并发

>ProgrammingActors/FileExplorer.scala

@@snip[代码清单13-9](../../main/scala/chapter13/FileExplorer.scala){ #snip }

>ProgrammingActors/FilesCounter.scala

@@snip[代码清单13-10](../../main/scala/chapter13/FilesCounter.scala){ #snip }

>ProgrammingActors/CountFiles.scala

@@snip[代码清单13-11](../../main/scala/chapter13/CountFiles.scala){ #snip }

*执行命令*

@@snip[代码清单13-1运行命名](../../main/scala/chapter13/RunCountFiles.sh){ #snip }

*运行结果*

@@snip[代码清单13-11运行结果](../../main/scala/chapter13/shoutput/RunCountFiles.output){ #output }

