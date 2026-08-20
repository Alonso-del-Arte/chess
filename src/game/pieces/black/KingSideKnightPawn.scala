package game.pieces.black

import game.{RelativePosition, RelativePositionRange}

object KingSideKnightPawn extends BlackPawn with BlackPiece {
  override val canJumpOver: Boolean = false
  override val captureSameAsMove: Boolean = false
  override val possibleCaptures: Set[RelativePositionRange] =
    Set(RelativePositionRange(new RelativePosition(-1, -1)),
      RelativePositionRange(new RelativePosition(1, -1)))
  override val hasSpecialMoves: Boolean = true

}
