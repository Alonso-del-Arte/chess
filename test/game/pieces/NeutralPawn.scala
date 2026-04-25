package game.pieces

import game.{Player, RelativePosition, RelativePositionRange}

object NeutralPawn extends Pawn {
  override val affiliation: Player = game.White
  override val possibleMoves: Set[RelativePositionRange] = Set()

}
