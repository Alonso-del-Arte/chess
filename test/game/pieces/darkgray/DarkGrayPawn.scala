package game.pieces.darkgray

import game.{RelativePosition, RelativePositionRange}
import game.pieces.Pawn

abstract class DarkGrayPawn extends Pawn with DarkGrayPiece {
  // TODO: Write a test for this
  override val possibleMoves: Set[RelativePositionRange] =
    Set(RelativePositionRange(new RelativePosition(0, -10)))
  // TODO: Write a test for this
  override def possibleCaptures: Set[RelativePositionRange] =
    Set(RelativePositionRange(new RelativePosition(0, -10)))
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = false

}
