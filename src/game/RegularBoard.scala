package game

import java.awt.Color

object RegularBoard extends Board {

  private val rankAndFileRange: Range = 1 to 8

  override def contains(position: Position): Boolean = position match {
    case pos: RegularPosition => rankAndFileRange.contains(pos.x) &&
      rankAndFileRange.contains(pos.y)
    case _ => true
  }

  // TODO: Write a test for this
  override def getColor(position: Position): Color = Color.GRAY

}
