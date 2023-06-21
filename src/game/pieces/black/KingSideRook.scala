package game.pieces.black

import game.{Neutral, Player, RelativePositionRange}
import game.pieces.Rook

object KingSideRook extends Rook with BlackPiece {
  override val affiliation: Player = Neutral
  override val possibleMoves: Set[RelativePositionRange] = Set()
  override val canJumpOver: Boolean = true
  override val captureSameAsMove: Boolean = false
  override val possibleCaptures: Set[RelativePositionRange] = Set()

}
