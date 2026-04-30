package game.pieces

import game.{Neutral, Player, RelativePosition, RelativePositionRange}

class PromotedRook(val pawn: Pawn) extends Rook with Promoted {
  override val affiliation: Player = pawn.affiliation
  override val possibleCaptures: Set[RelativePositionRange] = this.possibleMoves
  override def prior: Pawn = pawn

}
