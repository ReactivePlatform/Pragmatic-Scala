val george = new Person("George", "Washington")

val georgesDogs = List(new Dog("Captain"), new Dog("Clode"),
  new Dog("Forester"), new Dog("Searcher"))

println(s"$george had several dogs ${georgesDogs.mkString(", ")}...")
