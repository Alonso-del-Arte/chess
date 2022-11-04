package game.pieces

import game.RelativePositionRange

abstract class King extends Piece {
  override val possibleMoves: Set[RelativePositionRange] = Set()
  override val canJumpOver: Boolean = false

}
