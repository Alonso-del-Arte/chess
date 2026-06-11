package game.pieces.black

import game.RelativePositionRange
import game.pieces.Rook

object QueenSideRook extends Rook with BlackPiece {
  // TODO: Write a test for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write a test for this
  override val possibleCaptures: Set[RelativePositionRange] = Set()
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = true

}
