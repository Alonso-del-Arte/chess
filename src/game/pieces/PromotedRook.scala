package game.pieces

import game.Player

class PromotedRook(val pawn: Pawn) extends Rook with Promoted {
  override val affiliation: Player = pawn.affiliation
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = true
  override val couldCastle: Boolean = false
  override def prior: Pawn = pawn

}
