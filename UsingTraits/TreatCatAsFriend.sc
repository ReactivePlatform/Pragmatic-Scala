def useFriend(friend: Friend): Unit = friend.listen()

val angel = new Cat("Angel") with Friend
val friend: Friend = angel
angel.listen()

useFriend(angel)
