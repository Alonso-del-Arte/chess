package game.pieces.black

import game.{Black, Player, RelativePosition, RelativePositionRange}

object KingSideBishopPawn extends BlackPawn with BlackPiece {
  override val affiliation: Player = Black
  override val possibleMoves: Set[RelativePositionRange]
  = Set(new RelativePositionRange(new RelativePosition(0, -1),
    new RelativePosition(0, -2)))
  override val canJumpOver: Boolean = false
  override val captureSameAsMove: Boolean = false
  override val possibleCaptures: Set[RelativePositionRange]
  = Set(RelativePositionRange(new RelativePosition(-1, -1)),
    RelativePositionRange(new RelativePosition(1, -1)))

}
