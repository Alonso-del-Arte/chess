package game.pieces.darkgray

import game.{DarkGray, Player, RelativePosition, RelativePositionRange}

object PointyHatGuysPawn extends DarkGrayPawn with DarkGrayPiece {
  override val affiliation: Player = DarkGray
  override val possibleMoves: Set[RelativePositionRange] =
    Set(new RelativePositionRange(new RelativePosition(0, -1),
      new RelativePosition(0, -2)))
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
