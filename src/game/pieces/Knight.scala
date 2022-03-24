package game.pieces

import game.RelativePositionRange

abstract class Knight extends Piece {
  override val possibleMoves: Set[RelativePositionRange] = Set()

}
