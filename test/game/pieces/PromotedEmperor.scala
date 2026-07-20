package game.pieces

import game.Player

// TODO: Change to extend Emperor rather than King directly
class PromotedEmperor(val pawn: Pawn) extends King with Promoted {
  override val affiliation: Player = this.pawn.affiliation

  // TODO: Write tests for this
  override def prior: Pawn = NeutralPawn

}
