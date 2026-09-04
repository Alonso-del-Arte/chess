package game.pieces.darkgray

import game.{DarkGray, Player, RelativePosition, RelativePositionRange}

object HorsesPawn extends DarkGrayPawn with DarkGrayPiece {
  override val affiliation: Player = DarkGray
  override val possibleMoves: Set[RelativePositionRange] =
    Set(new RelativePositionRange(new RelativePosition(0, -1),
      new RelativePosition(0, -2)))
  override val canJumpOver: Boolean = false
  override val captureSameAsMove: Boolean = false
  // TODO: Write a test for this
  override val possibleCaptures: Set[RelativePositionRange] =
    Tower.possibleCaptures
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = false

}
