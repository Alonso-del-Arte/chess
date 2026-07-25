package game.pieces

import game.Player

class PromotedEmpress(val pawn: Pawn) extends Empress with Promoted {
  override val affiliation: Player = pawn.affiliation
  override val hasSpecialMoves: Boolean = false

  // TODO: Write tests for this
  override def prior: Pawn = NeutralPawn

}
