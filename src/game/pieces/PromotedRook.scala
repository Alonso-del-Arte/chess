package game.pieces

import game.Player

class PromotedRook(val pawn: Pawn) extends Rook with Promoted {
  override val affiliation: Player = pawn.affiliation

  override def prior: Pawn = pawn

}
