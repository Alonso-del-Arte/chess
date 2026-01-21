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

  def apply(x: Int, y: Int): RegularPosition = new RegularPosition(x, y)

}

/**
 * Represents a position on a regular chess board, such as for example e4.
 * @param x The file as an integer, 1 for 'a' to 8 for 'h'. For example, 5 for
 *          'e' in e4.
 * @param y The column, at least 1, at most 8. For example, 4 in e4.
 */
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
