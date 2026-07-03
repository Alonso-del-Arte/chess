package game.pieces.black

import game.RelativePositionRange
import game.pieces.Bishop

object QueenSideBishop extends Bishop with BlackPiece {
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true
  // TODO: Write tests for this
  override def possibleCaptures: Set[RelativePositionRange] =
    Set(Bishop.moveNorthwest)

}
