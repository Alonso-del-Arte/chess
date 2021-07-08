package game

import java.awt.Color

object RegularBoard extends Board {

  // TODO: Write a test for this
  override def contains(position: Position): Boolean = position match {
    case pos: RegularPosition => false
    case _ => true
  }

  // TODO: Write a test for this
  override def getColor(position: Position): Color = Color.GRAY

}
