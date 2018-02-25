import scala.beans.BeanProperty

class Dude(@BeanProperty val firstName: String, val lastName: String) {
  @BeanProperty var position: String = _
}
