package game.pieces.black

import game.{RelativePosition, RelativePositionRange}

object KingSideRookPawn extends BlackPawn with BlackPiece {
  override val possibleMoves: Set[RelativePositionRange] =
    Set(new RelativePositionRange(new RelativePosition(0, -1),
      new RelativePosition(0, -1)))

}
