package game.pieces

import game.{Player, RelativePosition, RelativePositionRange}

class PromotedRook(val pawn: Pawn) extends Rook with Promoted {
  override val affiliation: Player = pawn.affiliation
  override val possibleMoves: Set[RelativePositionRange] = Set()
  override val canJumpOver: Boolean = true
  override val captureSameAsMove: Boolean = false
  override val possibleCaptures: Set[RelativePositionRange] =
    Set(new RelativePositionRange(new RelativePosition(0, 0),
      new RelativePosition(8, 8)))
  override def prior: Pawn = pawn

}
