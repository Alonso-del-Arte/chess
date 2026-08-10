package game.pieces.white

import game.{RelativePosition, RelativePositionRange}

object KingSideKnightPawn extends WhitePawn {
  override val possibleCaptures: Set[RelativePositionRange] =
    Set(RelativePositionRange(new RelativePosition(-1, 1)),
      RelativePositionRange(new RelativePosition(1, 1)))
  override val hasSpecialMoves: Boolean = true

}
