package game.pieces.lightgray

import game.{LightGray, Player, RelativePosition, RelativePositionRange}

object EmperorsPawn extends LightGrayPawn with LightGrayPiece {
  override val affiliation: Player = LightGray
  override val possibleMoves: Set[RelativePositionRange] =
    Set(new RelativePositionRange(new RelativePosition(0, 1),
      new RelativePosition(0, 2)))
  override val canJumpOver: Boolean = false
  override val captureSameAsMove: Boolean = false
  override val possibleCaptures: Set[RelativePositionRange] =
    Set(RelativePositionRange(new RelativePosition(-1, 1)),
      RelativePositionRange(new RelativePosition(1, 1)))
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = false

}
