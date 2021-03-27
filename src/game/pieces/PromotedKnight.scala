package game.pieces

import game.Player

class PromotedKnight(val pawn: Pawn) extends Bishop with Promoted {
  override val affiliation: Player = pawn.affiliation

  override def prior: Pawn = pawn

}
