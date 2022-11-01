package game.pieces.white

import game.{RelativePosition, RelativePositionRange}

class WhitePawn extends WhitePiece {
  override val possibleMoves: Set[RelativePositionRange] =
    Set(RelativePositionRange(new RelativePosition(0, 1)))

}
