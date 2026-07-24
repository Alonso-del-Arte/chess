package game.pieces

import game.{Player, RelativePositionRange}

class PromotedEmpress(val pawn: Pawn) extends Empress with Promoted {
  override val affiliation: Player = pawn.affiliation
  override val captureSameAsMove: Boolean = true
  // TODO: Write tests for this
  override val possibleCaptures: Set[RelativePositionRange] =
    Set(Rook.moveForward)
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true

  // TODO: Write tests for this
  override def prior: Pawn = NeutralPawn

}
