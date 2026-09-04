package game.pieces.darkgray

import game.{DarkGray, Neutral, Player, RelativePosition, RelativePositionRange}

object PointyHatGuysPawn extends DarkGrayPawn with DarkGrayPiece {
  // TODO: Write a test for this
  override val affiliation: Player = Neutral
  // TODO: Write a test for this
  override val possibleMoves: Set[RelativePositionRange] = Horse.possibleMoves
  // TODO: Write a test for this
  override val canJumpOver: Boolean = true
  // TODO: Write a test for this
  override val captureSameAsMove: Boolean = true
  // TODO: Write a test for this
  override val possibleCaptures: Set[RelativePositionRange] =
    Tower.possibleCaptures
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = false

}
