package game.pieces

import game.{Neutral, Player, RelativePositionRange}

object NeutralPawn extends Pawn {
  override val affiliation: Player = Neutral
  override val possibleMoves: Set[RelativePositionRange] = Set()

}
