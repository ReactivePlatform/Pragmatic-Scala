class Human(val name: String) extends Friend

class Woman(override val name: String) extends Human(name)
class Man(override val name: String) extends Human(name)
