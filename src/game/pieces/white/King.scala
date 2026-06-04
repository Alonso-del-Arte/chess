package game.pieces.white

import game.{Player, RelativePositionRange, ShortMoveRanges, White}

object King extends game.pieces.King with WhitePiece {
  override val affiliation: Player = White
  // TODO: Write tests for this
  override val possibleMoves: Set[RelativePositionRange] =
    Set(ShortMoveRanges.moveForward)
  // TODO: Write tests for this
  override val canJumpOver: Boolean = true
  // TODO: Write tests for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = false

}
