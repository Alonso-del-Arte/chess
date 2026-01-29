package game

import java.awt.Color

abstract class Board(val maxX: Int, val maxY: Int, val minX: Int = 1,
                     val minY: Int = 1) {

  def contains(position: Position): Boolean =
    (position.x >= minX) && (position.y >= minY)

  def getColor(position: Position): Color

}
