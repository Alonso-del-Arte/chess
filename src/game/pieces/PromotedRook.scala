package game.pieces

import game.{Neutral, Player, RelativePosition, RelativePositionRange}

class PromotedRook(val pawn: Pawn) extends Rook with Promoted {
  override val affiliation: Player = pawn.affiliation
  val forwards = new RelativePositionRange(new RelativePosition(0, 1),
    new RelativePosition(0, 7))
  val right = new RelativePositionRange(new RelativePosition(1, 0),
    new RelativePosition(7, 0))
  val backwards = new RelativePositionRange(new RelativePosition(0, -1),
    new RelativePosition(0, -7))
  val left = new RelativePositionRange(new RelativePosition(-1, 0),
    new RelativePosition(-7, 0))
  override val possibleMoves: Set[RelativePositionRange] =
    Set(forwards, right, backwards, left)
  override def prior: Pawn = pawn

}
