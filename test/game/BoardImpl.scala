package game

import java.awt.Color

class BoardImpl(maxX: Int, maxY: Int) extends Board(maxX, maxY) {

  override def contains(position: Position): Boolean = false

  override def getColor(position: Position): Color = Color.BLACK

}
