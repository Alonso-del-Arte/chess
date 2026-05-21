package game.pieces

import game.Player

class PromotedRook(val pawn: Pawn) extends Rook with Promoted {
  override val affiliation: Player = pawn.affiliation
  override val couldCastle: Boolean = false
  override def prior: Pawn = pawn

}
