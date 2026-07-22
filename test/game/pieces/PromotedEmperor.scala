package game.pieces

import game.Player

class PromotedEmperor(val pawn: Pawn) extends Emperor with Promoted {
  override val affiliation: Player = this.pawn.affiliation
  override val hasSpecialMoves: Boolean = false

  override def prior: Pawn = this.pawn

}
