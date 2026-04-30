package game.pieces

import game.{Neutral, Player, RelativePosition, RelativePositionRange}

class PromotedRook(val pawn: Pawn) extends Rook with Promoted {
  override val affiliation: Player = pawn.affiliation
  override val captureSameAsMove: Boolean = true
  override def prior: Pawn = pawn

}
