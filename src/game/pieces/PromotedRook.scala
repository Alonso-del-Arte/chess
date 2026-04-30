package game.pieces

import game.{Neutral, Player, RelativePosition, RelativePositionRange}

class PromotedRook(val pawn: Pawn) extends Rook with Promoted {
  override val affiliation: Player = pawn.affiliation
  override val canJumpOver: Boolean = false
  override def prior: Pawn = pawn

}
