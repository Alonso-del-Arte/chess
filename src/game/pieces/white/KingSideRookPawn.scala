package game.pieces.white

import game.{Player, RelativePositionRange, White}

object KingSideRookPawn extends WhitePawn {
  override val affiliation: Player = White
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
