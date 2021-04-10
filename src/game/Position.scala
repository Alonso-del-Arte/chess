package game

abstract class Position(val x: Int, val y: Int) {

  override def toString: String = s"($x, $y)"

  override def equals(obj: Any): Boolean = obj match {
    case other: Position => (this.x == other.x && this.y == other.y) &&
      this.getClass == other.getClass
    case _ => false
  }

  override def hashCode: Int = {
    val base = this.getClass.getCanonicalName.hashCode
    base + (this.x << 16) + this.y
  }

  def translate(offset: RelativePosition): Position

}
