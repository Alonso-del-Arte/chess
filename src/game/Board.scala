package game

import java.awt.Color

abstract class Board(val maxX: Int, val maxY: Int, val minX: Int = 1,
                     val minY: Int = 1) {

  def contains(position: Position): Boolean = false

  def getColor(position: Position): Color

}
