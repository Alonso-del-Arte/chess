package game.pieces

import game.{Player, RelativePositionRange}

class PromotedEmpress(val pawn: Pawn) extends Empress with Promoted {
  override val affiliation: Player = pawn.affiliation
  override val possibleCaptures: Set[RelativePositionRange] =
    Bishop.moves ++ Rook.moves
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true

  // TODO: Write tests for this
  override def prior: Pawn = NeutralPawn

}
