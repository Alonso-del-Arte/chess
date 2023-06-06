package game.pieces.lightgray

import game.{RelativePosition, RelativePositionRange}
import game.pieces.Pawn

class LightGrayPawn extends Pawn with LightGrayPiece {
  override val possibleMoves: Set[RelativePositionRange] =
    Set(RelativePositionRange(new RelativePosition(0, 1)))

}
