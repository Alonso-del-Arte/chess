package game

object RegularPosition {

  def apply(s: String): RegularPosition = {
    if (s.length < 2) {
      val excMsg = s"Position specification $s is too short"
      throw new IllegalArgumentException(excMsg)
    }
    val x = s(0).toInt - 96
    val y = s(1).toInt - 48
    new RegularPosition(x, y)
  }

}

class RegularPosition(x: Int, y: Int) extends Position(x, y) {

  override def toString: String = s"${(x + 96).toChar}${(y + 48).toChar}"

  override def isOffsetWithinBounds(offset: RelativePosition,
                                    board: Board): Boolean = {
    val diffX = this.x + offset.offsetX
    val diffY = this.y + offset.offsetY
    (diffX > 0 && diffX < 9) && (diffY > 0 && diffY < 9)
  }

  def translate(offset: RelativePosition): Position =
    new RegularPosition(this.x + offset.offsetX, this.y + offset.offsetY)

}
