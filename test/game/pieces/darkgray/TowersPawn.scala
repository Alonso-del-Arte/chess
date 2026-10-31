package game.pieces.darkgray

import game.{RelativePositionRange, ShortMoveRanges}

object TowersPawn extends DarkGrayPawn {
  override val possibleMoves: Set[RelativePositionRange] =
    Set(ShortMoveRanges.moveBack)

}
