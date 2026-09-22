package game.pieces.lightgray

import game.{LightGray, Neutral, Player, RelativePosition, RelativePositionRange}

object TowersPawn extends LightGrayPawn with LightGrayPiece {
  override val affiliation: Player = LightGray
  override val possibleMoves: Set[RelativePositionRange] =
    Set(new RelativePositionRange(new RelativePosition(0, 1),
      new RelativePosition(0, 2)))
  override val canJumpOver: Boolean = false
  override val captureSameAsMove: Boolean = false
  // TODO: Write a test for this
  override val possibleCaptures: Set[RelativePositionRange] =
    Empress.possibleCaptures
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = false

}
