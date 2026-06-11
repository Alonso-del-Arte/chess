package game.pieces.black

import game.{Black, Player, RelativePositionRange}
import game.pieces.Rook

object KingSideRook extends Rook with BlackPiece {
  // TODO: Write a test for this
  override val canJumpOver: Boolean = true
  // TODO: Write a test for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write a test for this
  override val possibleCaptures: Set[RelativePositionRange] = Set()
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = true

}
