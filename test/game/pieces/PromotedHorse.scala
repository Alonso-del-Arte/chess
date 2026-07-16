package game.pieces

import game.{Neutral, Player, RelativePositionRange}

class PromotedHorse(val pawn: Pawn) extends Knight with Promoted {
  // TODO: Write tests for this
  override val affiliation: Player = Neutral
  // TODO: Write tests for this
  override val possibleMoves: Set[RelativePositionRange] = Set()
  // TODO: Write tests for this
  override val canJumpOver: Boolean = false
  // TODO: Write tests for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write tests for this
  override val possibleCaptures: Set[RelativePositionRange] = Set()
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true

  // TODO: Write tests for this
  override def prior: Pawn = NeutralPawn

}
