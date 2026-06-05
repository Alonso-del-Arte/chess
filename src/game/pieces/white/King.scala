package game.pieces.white

import game.{RelativePositionRange, ShortMoveRanges}

object King extends game.pieces.King with WhitePiece {
  override val captureSameAsMove: Boolean = true
  override def possibleCaptures: Set[RelativePositionRange] =
    Set(ShortMoveRanges.moveForward, ShortMoveRanges.moveRight,
      ShortMoveRanges.moveBack, ShortMoveRanges.moveLeft,
      ShortMoveRanges.moveNortheast, ShortMoveRanges.moveNorthwest,
      ShortMoveRanges.moveSouthwest, ShortMoveRanges.moveSoutheast)
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = false

}
