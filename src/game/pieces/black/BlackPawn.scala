package game.pieces.black

import game.{RelativePosition, RelativePositionRange}
import game.pieces.Pawn

abstract class BlackPawn extends Pawn with BlackPiece {
  override val possibleMoves: Set[RelativePositionRange] =
    Set(RelativePositionRange(new RelativePosition(0, -1)))

}
