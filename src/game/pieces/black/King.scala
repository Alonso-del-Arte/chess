package game.pieces.black

import game.{Black, Player, RelativePositionRange}

object King extends game.pieces.King with BlackPiece {
  // TODO: Write a test for this
  override val possibleMoves: Set[RelativePositionRange] = Set()
  override val captureSameAsMove: Boolean = true

}
