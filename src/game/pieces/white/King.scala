package game.pieces.white

import game.{Player, Neutral, RelativePositionRange, ShortMoveRanges}

object King extends game.pieces.King with WhitePiece {
  // TODO: Write tests for this
  override val affiliation: Player = Neutral
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
