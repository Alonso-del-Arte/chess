package game.pieces

import game.{Neutral, Player, RelativePosition, RelativePositionRange}

class PromotedQueen(val pawn: Pawn) extends Queen with Promoted {
  override val affiliation: Player = pawn.affiliation
  override def prior: Pawn = pawn

}
