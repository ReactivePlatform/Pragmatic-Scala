import java._

var list1 = new util.ArrayList[Int]
var list2 = new util.ArrayList[Any]

var ref1: Int = 1
var ref2: Any = _

ref2 = ref1 //OK

list2 = list1 // Compilation Error
