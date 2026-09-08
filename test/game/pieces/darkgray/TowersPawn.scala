package game.pieces.darkgray

import game.{Neutral, Player, RelativePosition, RelativePositionRange}

object TowersPawn extends DarkGrayPawn with DarkGrayPiece {
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
    PointyHatGuysPawn.possibleCaptures
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = false

}
