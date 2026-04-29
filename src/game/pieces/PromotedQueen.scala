package game.pieces

import game.{Player, RelativePosition, RelativePositionRange}

class PromotedQueen(val pawn: Pawn) extends Queen with Promoted {
  override val affiliation: Player = pawn.affiliation
  override val possibleCaptures: Set[RelativePositionRange] = this.possibleMoves
  override def prior: Pawn = pawn

}
