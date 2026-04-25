package game.pieces

import game.{Player, RelativePosition, RelativePositionRange}

object NeutralPawn extends Pawn {
  override val affiliation: Player = game.Black
  override val possibleMoves: Set[RelativePositionRange] =
    Set(RelativePositionRange(new RelativePosition(0, 1)))

}
