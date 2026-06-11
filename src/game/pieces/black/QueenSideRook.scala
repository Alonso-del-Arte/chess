package game.pieces.black

import game.{Black, Player, RelativePositionRange}
import game.pieces.Rook

object QueenSideRook extends Rook with BlackPiece {
  override val affiliation: Player = Black
  // TODO: Write a test for this
  override val possibleMoves: Set[RelativePositionRange] = Set()
  // TODO: Write a test for this
  override val canJumpOver: Boolean = true
  // TODO: Write a test for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write a test for this
  override val possibleCaptures: Set[RelativePositionRange] = Set()
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = true

}
