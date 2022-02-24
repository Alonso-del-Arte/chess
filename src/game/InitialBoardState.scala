package game
import java.awt.Color

object InitialBoardState extends BoardState(new Board {

  override def contains(position: Position): Boolean = true

  override def getColor(position: Position): Color = Color.GRAY

}, Black, Map(), Set(game.pieces.white.KingSideBishop))
