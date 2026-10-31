package game.pieces.lightgray

import game.{RelativePosition, RelativePositionRange}

object EmperorsPawn extends LightGrayPawn {
  override val possibleMoves: Set[RelativePositionRange] =
    Set(new RelativePositionRange(new RelativePosition(0, 1),
      new RelativePosition(0, 1)))

}
