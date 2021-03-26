package game

import java.awt.Color

object FauxBoard extends Board {

  override def contains(position: Position): Boolean = true

  override def getColor(position: Position): Color = Color.GRAY

}
