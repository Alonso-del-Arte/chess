package game

abstract class Position(val x: Int, val y: Int) {

  override def toString: String = s"($x, $y)"

  override def equals(obj: Any): Boolean = false

  override def hashCode: Int = 0

  def translate(offset: RelativePosition): Position

}
