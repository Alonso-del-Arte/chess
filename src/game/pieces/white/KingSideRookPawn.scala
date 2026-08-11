package game.pieces.white

import game.{Player, RelativePosition, RelativePositionRange, White}

object KingSideRookPawn extends WhitePawn {
  override val possibleCaptures: Set[RelativePositionRange] =
    Set(RelativePositionRange(new RelativePosition(-1, 1)),
      RelativePositionRange(new RelativePosition(1, 1)))
  override val hasSpecialMoves: Boolean = true

}
