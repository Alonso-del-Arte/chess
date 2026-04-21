package game.pieces

import game.{Neutral, Player, RelativePosition, RelativePositionRange}

class PromotedBishop(val pawn: Pawn) extends Bishop with Promoted {
  override val affiliation: Player = pawn.affiliation
  override val canJumpOver: Boolean = true
  override val captureSameAsMove: Boolean = false
  val toNortheast = new RelativePositionRange(new RelativePosition(1, -1),
    new RelativePosition(7, -7))
  val toNorthwest = new RelativePositionRange(new RelativePosition(1, 1),
    new RelativePosition(7, 7))
  val toSouthwest = new RelativePositionRange(new RelativePosition(-1, 1),
    new RelativePosition(-7, 7))
  val toSoutheast = new RelativePositionRange(new RelativePosition(-1, -1),
    new RelativePosition(-7, -7))
  override val possibleMoves: Set[RelativePositionRange] =
    Set(toNorthwest, toNortheast, toSouthwest, toSoutheast)
  override def prior: Pawn = new Pawn {
    override val affiliation: Player = Neutral
    override val possibleMoves: Set[RelativePositionRange] = Set()
  }//pawn

}
