def useFriend(friend: Friend): Unit = friend.listen()

val alf = new Cat("Alf")
val friend: Friend = alf // ERROR

useFriend(alf) // ERROR
