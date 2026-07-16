package game.pieces

import game.{Neutral, Player, RelativePositionRange}

class PromotedEmperor extends King with Promoted {
  // TODO: Write tests for this
  override val affiliation: Player = Neutral
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
