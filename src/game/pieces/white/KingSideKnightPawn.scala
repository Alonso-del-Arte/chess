package game.pieces.white

import game.{RelativePosition, RelativePositionRange}

object KingSideKnightPawn extends WhitePawn {
  override val canJumpOver: Boolean = false
  override val captureSameAsMove: Boolean = false
  // TODO: Write a test for this
  override val possibleCaptures: Set[RelativePositionRange] =
    KingSideKnight.possibleCaptures
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = false

}
