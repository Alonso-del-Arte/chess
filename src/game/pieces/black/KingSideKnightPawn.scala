package game.pieces.black

import game.{Black, Player, RelativePosition, RelativePositionRange}

object KingSideKnightPawn extends BlackPawn with BlackPiece {
  override val affiliation: Player = Black
  override val possibleMoves: Set[RelativePositionRange] =
    Set(new RelativePositionRange(new RelativePosition(0, -1),
      new RelativePosition(0, -2)))
  override val canJumpOver: Boolean = false
  // TODO: Write a test for this
  override val captureSameAsMove: Boolean = true
  // TODO: Write a test for this
  override val possibleCaptures: Set[RelativePositionRange] =
    KingSideKnight.possibleCaptures
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = false

}
