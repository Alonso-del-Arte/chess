package game.pieces

import game.{Player, RelativePosition, RelativePositionRange}

class PromotedQueen(val pawn: Pawn) extends Queen with Promoted {
  override val affiliation: Player = pawn.affiliation
  override val canJumpOver: Boolean = true
  override def prior: Pawn = pawn

}
