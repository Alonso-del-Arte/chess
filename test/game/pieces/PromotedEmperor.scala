package game.pieces

import game.Player

class PromotedEmperor(val pawn: Pawn) extends King with Promoted {
  override val affiliation: Player = this.pawn.affiliation
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = false

  // TODO: Write tests for this
  override def prior: Pawn = NeutralPawn

}
