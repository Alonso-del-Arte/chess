package game.pieces.darkgray

import game.{DarkGray, Player, RelativePosition, RelativePositionRange}
import game.pieces.Pawn

abstract class DarkGrayPawn extends Pawn with DarkGrayPiece {
  override val affiliation: Player = DarkGray
  override val possibleMoves: Set[RelativePositionRange] =
    Set(new RelativePositionRange(new RelativePosition(0, -1),
      new RelativePosition(0, -2)))
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
