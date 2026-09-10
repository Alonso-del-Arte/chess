package game.pieces.lightgray

import game.{LightGray, Neutral, Player, RelativePosition,
  RelativePositionRange}
import game.pieces.Pawn

abstract class LightGrayPawn extends Pawn with LightGrayPiece {
  override val affiliation: Player = LightGray
  // TODO: Write a test for this
  override val possibleMoves: Set[RelativePositionRange] =
    Set(RelativePositionRange(new RelativePosition(0, -10)))
  // TODO: Write a test for this
  override val canJumpOver: Boolean = true
  // TODO: Write a test for this
  override val captureSameAsMove: Boolean = true
  // TODO: Write a test for this
  override def possibleCaptures: Set[RelativePositionRange] =
    Set(RelativePositionRange(new RelativePosition(0, -10)))
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = false

}
