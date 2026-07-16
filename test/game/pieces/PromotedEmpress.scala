package game.pieces

import game.{Neutral, Player, RelativePositionRange}

class PromotedEmpress(val pawn: Pawn) extends Queen with Promoted {
  // TODO: Write tests for this
  override val affiliation: Player = Neutral
  // TODO: Write tests for this
  override val possibleMoves: Set[RelativePositionRange] =
    Set(Bishop.moveSoutheast)
  // TODO: Write tests for this
  override val canJumpOver: Boolean = true
  // TODO: Write tests for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write tests for this
  override val possibleCaptures: Set[RelativePositionRange] =
    Set(Rook.moveForward)
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true

  // TODO: Write tests for this
  override def prior: Pawn = NeutralPawn

}
