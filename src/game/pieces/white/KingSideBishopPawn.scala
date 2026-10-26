package game.pieces.white

import game.{RelativePosition, RelativePositionRange}

object KingSideBishopPawn extends WhitePawn {
  override val possibleMoves: Set[RelativePositionRange]
  = Set(new RelativePositionRange(new RelativePosition(0, 1),
    new RelativePosition(0, 1)))

}
