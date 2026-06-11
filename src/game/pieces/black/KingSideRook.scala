package game.pieces.black

import game.{Black, Player, RelativePositionRange}
import game.pieces.Rook

object KingSideRook extends Rook with BlackPiece {
  override val captureSameAsMove: Boolean = true
  // TODO: Write a test for this
  override val possibleCaptures: Set[RelativePositionRange] = Set()
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = true

}
