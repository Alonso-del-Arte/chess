package game.pieces.lightgray

import game.{RelativePosition, RelativePositionRange}

object HorsesPawn extends LightGrayPawn {
  override val possibleMoves: Set[RelativePositionRange] =
    Set(new RelativePositionRange(new RelativePosition(0, 1),
      new RelativePosition(0, 1)))

}
