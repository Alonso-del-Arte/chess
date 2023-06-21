package game.pieces.white

import game.{Neutral, Player, RelativePositionRange}
import game.pieces.Rook

object KingSideRook extends Rook with WhitePiece {
  override val affiliation: Player = Neutral
  override val possibleMoves: Set[RelativePositionRange] = Set()
  override val canJumpOver: Boolean = true
  override val captureSameAsMove: Boolean = false
  override val possibleCaptures: Set[RelativePositionRange] = Set()

}
