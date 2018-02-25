class MyList[+T] //...
var list1 = new MyList[Int]
var list2: MyList[Any] = _
list2 = list1 // OK
