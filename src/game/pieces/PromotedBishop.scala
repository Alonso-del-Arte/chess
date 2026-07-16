package game.pieces

import game.Player

class PromotedBishop(val pawn: Pawn) extends Bishop with Promoted {
  override val affiliation: Player = this.pawn.affiliation
  override def prior: Pawn = this.pawn

}
