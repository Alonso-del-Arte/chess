package game

import java.awt.Color

abstract class Board {

  def contains(position: Position): Boolean

  def getColor(position: Position): Color

}
