package game.pieces.black

import game.{RelativePosition, RelativePositionRange}

abstract class BlackPawn extends BlackPiece {
  override val possibleMoves: Set[RelativePositionRange] =
    Set(RelativePositionRange(new RelativePosition(0, -1)))

}
