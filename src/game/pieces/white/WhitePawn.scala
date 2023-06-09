package game.pieces.white

import game.{RelativePosition, RelativePositionRange}
import game.pieces.Pawn

abstract class WhitePawn extends Pawn with WhitePiece {
  override val possibleMoves: Set[RelativePositionRange] =
    Set(RelativePositionRange(new RelativePosition(0, 1)))

}
