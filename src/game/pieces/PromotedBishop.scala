package game.pieces

import game.{Neutral, Player, RelativePosition, RelativePositionRange}

class PromotedBishop(val pawn: Pawn) extends Bishop with Promoted {
  override val affiliation: Player = pawn.affiliation
  override val canJumpOver: Boolean = true
  override val captureSameAsMove: Boolean = false
  override val possibleMoves: Set[RelativePositionRange] = Set()
  override def prior: Pawn = new Pawn {
    override val affiliation: Player = Neutral
    override val possibleMoves: Set[RelativePositionRange] = Set()
  }//pawn

}
