package game.pieces.black

import game.RelativePositionRange
import game.pieces.Bishop

object QueenSideBishop extends Bishop with BlackPiece {
  override val possibleMoves: Set[RelativePositionRange] = Bishop.moves
  // TODO: Write tests for this
  override val canJumpOver: Boolean = true
  // TODO: Write tests for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true
  // TODO: Write tests for this
  override def possibleCaptures: Set[RelativePositionRange] =
    Set(Bishop.moveNorthwest)

}
