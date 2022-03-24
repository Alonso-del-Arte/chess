package game.pieces

import game.{Player, RelativePositionRange}

abstract class Piece {
  val affiliation: Player
  val possibleMoves: Set[RelativePositionRange]

}
