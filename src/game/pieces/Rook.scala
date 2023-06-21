package game.pieces

import game.{Neutral, Player, RelativePositionRange}

abstract class Rook extends Piece {
  override val affiliation: Player = Neutral
  override val possibleMoves: Set[RelativePositionRange] = Set()
  override val canJumpOver: Boolean = true
  override val captureSameAsMove: Boolean = false
  override val possibleCaptures: Set[RelativePositionRange] = Set()

}
