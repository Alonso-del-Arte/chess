package game.pieces.darkgray

import game.{RelativePosition, RelativePositionRange}
import game.pieces.Pawn

class DarkGrayPawn extends Pawn with DarkGrayPiece {
  override val possibleMoves: Set[RelativePositionRange] =
    Set(RelativePositionRange(new RelativePosition(0, -1)))

}
