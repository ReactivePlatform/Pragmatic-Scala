# 《Scala实用指南》代码清单

> **需要注意的是：**<br>
> 我们同时还提供了基于 SBT 的版本，可以直接导入到 IDEA 中使用，不过部分代码清单略微有调整，请切换到 *sbt* 分支。我们默认展示原书自带的代码清单形式。
> 本书代码清单的在线版本，以及书中的版本都是基于的 **sbt** 分支。

## 组织形式

1. `sample` 分支，原书的文件夹形式，部分代码清单可能更新到 [Ammonite Script](https://github.com/lihaoyi/Ammonite) 形式的脚本。
2. `sbt` 分支，按照中文书章节形式组织，并且基于 SBT 构建工具进行组织，对应的代码清单大部分可以直接运行。

## IDE和构建工具

在工作中，大部分我们的代码都是利用构建工具和IDE进行组织和开发的。

推荐的IDE或在线环境为：

1. [IDEA](https://www.jetbrains.com/idea/)，同时需要安装 Scala 插件[intellij-scala](https://github.com/JetBrains/intellij-scala)
2. [ScalaIDE](http://scala-ide.org/)
3. [Ensime](http://ensime.github.io/)
4. 在线的 [ScalaFiddle](https://scalafiddle.io/) 或者 [scastie](https://scastie.scala-lang.org)

常用的构建工具为：

- Gradle ：需要安装插件[The Scala Plugin](https://docs.gradle.org/current/userguide/scala_plugin.html)
- Maven ：需要安装插件:
    - [scala-maven-plugin](https://github.com/davidB/scala-maven-plugin) 或者
    - [scalor-maven-plugin](https://github.com/random-maven/scalor-maven-plugin)
- [Mill](https://github.com/lihaoyi/mill) ：直接支持
- SBT : 直接支持，需要安装插件IDE插件。

## 代码清单使用说明

代码清单中以 `sc` 结尾的文件是 Scala Script，建议用scala命令运行，以 `scala` 结尾的文件是一般意义上的Scala代码文件。

前三章建议只用scala命令行，用法参照第二章中的说明。后面的章节请使用 scala, amm, javap, sbt 等工具，灵活地探索 Scala 代码的奥秘。

其中一些以 `.sc` 结尾的代码清单，并不能直接运行，这时需要借助于 [Ammonite](https://blog.jetbrains.com/scala/2018/05/07/ammonite-support/) 的力量。
如果读者有疑问，可以直接切换到sbt分支，找到对应的文件，进行运行。


## 代码清单使用示范
Tips:

+ 对于那些以sc结尾的，但是依赖了其他以scala结尾的文件中的类的Scala Script，建议前两种方法。
+ 在sbt中可以使用runMain，并附带命令行参数
+ 在sbt中可以使用`set scalaVersion := "2.11.8"`，临时切换Scala版本

### Using SBT in Chapter 7
``` bash
$ cd UsingTraits
$ sbt
sbt:usingtraits> compile
[success] Total time: 1 s, completed 2018-2-25 15:54:03
sbt:usingtraits> console
[info] Starting scala interpreter...
Welcome to Scala 2.12.4 (OpenJDK 64-Bit Server VM, Java 1.8.0_141).
Type in expressions for evaluation. Or try :help.

scala> :load UseCat.sc
Loading UseCat.sc...
useFriend: (friend: Friend)Unit
alf: Cat = Cat@24355401
UseCat.sc:12: error: type mismatch;
 found   : Cat
 required: Friend
val friend: Friend = alf // ERROR
                     ^
UseCat.sc:14: error: type mismatch;
 found   : Cat
 required: Friend
useFriend(alf) // ERROR
          ^

scala> :load TreatCat
warning: File `TreatCat' does not exist.

scala> :load TreatCatAsFriend.sc
Loading TreatCatAsFriend.sc...
useFriend: (friend: Friend)Unit
angel: Cat with Friend = $anon$1@4e462fbb
friend: Friend = $anon$1@4e462fbb
Your friend Angel is listening
Your friend Angel is listening
```

### Using scala in Chapter 10
``` bash
$ cd ExceptionHandling
$ scala -i Tax.scala 
Loading Tax.scala...
defined object Tax

Welcome to Scala 2.11.8 (OpenJDK 64-Bit Server VM, Java 1.8.0_141).
Type in expressions for evaluation. Or try :help.

scala> :load ExceptionHandling.sc
Loading ExceptionHandling.sc...
Amount: $100.0 Tax: $8.0
Amount: $0.009 Don't bother reporting...Amount too small to be taxed
Amount: $-2.0 Amount must be greater than zero
Amount: $1000001.0 java.lang.Exception: Amount too large...
  at Tax$.taxFor(<console>:19)
  at $anonfun$1.apply$mcVD$sp(<console>:16)
  at $anonfun$1.apply(<console>:13)
  at $anonfun$1.apply(<console>:13)
  at scala.collection.immutable.List.foreach(List.scala:381)
  ... 65 elided

scala> :load CatchAll.sc
Loading CatchAll.sc...
Amount: $100.0 Tax: $8.0
Amount: $0.009 Something went wrong
Amount: $-2.0 Amount must be greater than zero
Amount: $1000001.0 Something went wrong

scala> :load CatchOrder.sc
Loading CatchOrder.sc...
amount: Int = -2
Amount: $-2 Something went wrong

scala> 
```

### Using sbt in Chapter 13
``` bash
$ cd ProgrammingActors
$ sbt "runMain CountFiles ."
[info] Packaging /home/sadhen/bitbucket/note/PragmaticScala.tm/ProgrammingActors/target/scala-2.12/programmingactors_2.12-0.1.0-SNAPSHOT.jar ...
[info] Done packaging.
[info] Running CountFiles .
Files count: 130
Time taken: 0.098305576 seconds
```
