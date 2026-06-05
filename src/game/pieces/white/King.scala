package game.pieces.white

import game.{RelativePositionRange, ShortMoveRanges}

object King extends game.pieces.King with WhitePiece {
  override val captureSameAsMove: Boolean = true
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = false

}
