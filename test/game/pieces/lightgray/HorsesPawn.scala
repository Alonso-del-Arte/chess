package game.pieces.lightgray

import game.{LightGray, Player, RelativePosition, RelativePositionRange}

object HorsesPawn extends LightGrayPawn with LightGrayPiece {
  override val affiliation: Player = LightGray
  override val possibleMoves: Set[RelativePositionRange] =
    Set(new RelativePositionRange(new RelativePosition(0, 1),
      new RelativePosition(0, 2)))
  // TODO: Write a test for this
  override val canJumpOver: Boolean = true
  // TODO: Write a test for this
  override val captureSameAsMove: Boolean = true
  // TODO: Write a test for this
  override val possibleCaptures: Set[RelativePositionRange] =
    Empress.possibleCaptures
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = false

}
