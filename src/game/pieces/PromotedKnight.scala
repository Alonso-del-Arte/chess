package game.pieces

import game.{Player, RelativePosition, RelativePositionRange}

class PromotedKnight(val pawn: Pawn) extends Knight with Promoted {
  override val affiliation: Player = this.pawn.affiliation
  override val possibleMoves: Set[RelativePositionRange] = Set()
  override val possibleCaptures: Set[RelativePositionRange] =
    Set(new RelativePositionRange(new RelativePosition(0, 0),
      new RelativePosition(9, 8)))
  override def prior: Pawn = this.pawn

}
