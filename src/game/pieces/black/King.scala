package game.pieces.black

import game.{Neutral, Player, RelativePositionRange}

object King extends game.pieces.King with BlackPiece {
  override val affiliation: Player = Neutral
  override val possibleMoves: Set[RelativePositionRange] = Set()
  override val canJumpOver: Boolean = true
  override val captureSameAsMove: Boolean = false
  override val hasSpecialMoves: Boolean = false

}
