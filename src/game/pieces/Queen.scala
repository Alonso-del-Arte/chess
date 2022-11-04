package game.pieces

import game.RelativePositionRange

abstract class Queen extends Piece {
  override val possibleMoves: Set[RelativePositionRange] = Set()
  override val canJumpOver: Boolean = false

}
