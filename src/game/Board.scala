package game

import java.awt.Color

abstract class Board(val maxX: Int, val maxY: Int, val minX: Int = 1,
                     val minY: Int = 1) {

  def contains(position: Position): Boolean =
    (position.x >= minX) && (position.x <= maxX) &&
      (position.y >= minY) && (position.y <= maxY)

  def getColor(position: Position): Color

}
