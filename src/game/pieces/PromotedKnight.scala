package game.pieces

import game.{Neutral, Player, RelativePosition, RelativePositionRange}

class PromotedKnight(val pawn: Pawn) extends Knight with Promoted {
  override val affiliation: Player = pawn.affiliation
  override val possibleMoves: Set[RelativePositionRange] = Set()
  override val possibleCaptures: Set[RelativePositionRange] =
    Set(new RelativePositionRange(new RelativePosition(0, 0),
      new RelativePosition(9, 8)))
      // TODO: Write a test for this
  override def prior: Pawn = new Pawn {
    override val affiliation: Player = Neutral
    override val possibleMoves: Set[RelativePositionRange] = Set()
  }

}
