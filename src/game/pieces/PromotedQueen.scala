package game.pieces

import game.Player

class PromotedQueen(val pawn: Pawn) extends Queen with Promoted {
  override val affiliation: Player = pawn.affiliation
  override def prior: Pawn = pawn
  override val hasSpecialMoves: Boolean = false

}
