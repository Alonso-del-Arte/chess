package game.pieces

import game.{Player, RelativePositionRange}

class PromotedQueen(val pawn: Pawn) extends Queen with Promoted {
  override val affiliation: Player = pawn.affiliation
  override val possibleMoves: Set[RelativePositionRange] = Set()
  override def prior: Pawn = pawn

}
