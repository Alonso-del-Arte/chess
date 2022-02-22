package game

import java.awt.Color

object RegularBoard extends Board {

  private val rankAndFileRange: Range = 1 to 8

  override def contains(position: Position): Boolean = position match {
    case pos: RegularPosition => rankAndFileRange.contains(pos.x) &&
      rankAndFileRange.contains(pos.y)
    case _ => false
  }

  override def getColor(position: Position): Color = {
    if (this.contains(position)) {
      if ((position.x + position.y) % 2 == 0) {
        Color.BLACK
      } else {
        Color.WHITE
      }
    } else {
      Color.MAGENTA
    }
  }

}
