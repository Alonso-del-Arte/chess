package game.pieces.white

import game.RelativePositionRange
import game.pieces.Bishop

object QueenSideBishop extends Bishop with WhitePiece {
  // TODO: Write tests for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true
  // TODO: Write tests for this
  override def possibleCaptures: Set[RelativePositionRange] =
    Set(Bishop.moveNorthwest)

}
