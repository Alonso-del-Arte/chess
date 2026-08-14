package game.pieces.white

import game.{Player, RelativePosition, RelativePositionRange, White}

object QueenSideKnightPawn extends WhitePawn {
  override val captureSameAsMove: Boolean = false
  override val possibleCaptures: Set[RelativePositionRange]
  = Set(RelativePositionRange(new RelativePosition(-1, 1)),
    RelativePositionRange(new RelativePosition(1, 1)))
  override val hasSpecialMoves: Boolean = true

}
