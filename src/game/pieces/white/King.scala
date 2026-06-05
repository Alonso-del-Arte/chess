package game.pieces.white

import game.{RelativePositionRange, ShortMoveRanges}

object King extends game.pieces.King with WhitePiece {
  // TODO: Write tests for this
  override val canJumpOver: Boolean = true
  // TODO: Write tests for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = false

}
