package game.pieces.black

import game.{Black, Player, RelativePosition, RelativePositionRange}

object KingPawn extends BlackPawn with BlackPiece {
  override val affiliation: Player = Black
  // TODO: Write a test for this
  override val possibleMoves: Set[RelativePositionRange] =
    KingSideKnight.possibleMoves
  // TODO: Write a test for this
  override val canJumpOver: Boolean = true
  // TODO: Write a test for this
  override val captureSameAsMove: Boolean = true
  // TODO: Write a test for this
  override val possibleCaptures: Set[RelativePositionRange] =
    KingSideKnight.possibleCaptures
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = false

}
