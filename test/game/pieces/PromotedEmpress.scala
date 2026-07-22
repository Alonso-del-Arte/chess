package game.pieces

import game.{Player, RelativePositionRange}

class PromotedEmpress(val pawn: Pawn) extends Empress with Promoted {
  override val affiliation: Player = pawn.affiliation
  // TODO: Write tests for this
  override val possibleMoves: Set[RelativePositionRange] = Bishop.moves
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
