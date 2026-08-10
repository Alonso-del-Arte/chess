package game.pieces.white

import game.{RelativePosition, RelativePositionRange}

object KingSideKnightPawn extends WhitePawn {
  override val canJumpOver: Boolean = false
  override val captureSameAsMove: Boolean = false
  override val possibleCaptures: Set[RelativePositionRange] =
    Set(RelativePositionRange(new RelativePosition(-1, 1)),
      RelativePositionRange(new RelativePosition(1, 1)))
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = false

}
