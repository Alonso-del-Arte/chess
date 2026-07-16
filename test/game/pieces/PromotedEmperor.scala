package game.pieces

import game.{Player, RelativePositionRange}

class PromotedEmperor(val pawn: Pawn) extends King with Promoted {
  override val affiliation: Player = this.pawn.affiliation
  // TODO: Write tests for this
  override val possibleMoves: Set[RelativePositionRange] = Set()
  // TODO: Write tests for this
  override val canJumpOver: Boolean = true
  // TODO: Write tests for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write tests for this
  override val possibleCaptures: Set[RelativePositionRange] = Set()
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = false

  // TODO: Write tests for this
  override def prior: Pawn = NeutralPawn

}
