package game.pieces.lightgray

import game.{LightGray, Player, RelativePosition, RelativePositionRange}
import game.pieces.Pawn

abstract class LightGrayPawn extends Pawn with LightGrayPiece {
  override val possibleMoves: Set[RelativePositionRange] =
    Set(new RelativePositionRange(new RelativePosition(0, 1),
      new RelativePosition(0, 2)))
  override val possibleCaptures: Set[RelativePositionRange] =
    Set(RelativePositionRange(new RelativePosition(-1, 1)),
      RelativePositionRange(new RelativePosition(1, 1)))
}
