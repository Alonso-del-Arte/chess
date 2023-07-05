package game.pieces

import game.{Player, RelativePosition, RelativePositionRange}

class PromotedBishop(val pawn: Pawn) extends Bishop with Promoted {
  override val affiliation: Player = pawn.affiliation
  override def prior: Pawn = pawn

}
