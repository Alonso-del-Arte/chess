package game.pieces

import game.RelativePositionRange

abstract class Queen extends Piece {
  override val possibleMoves: Set[RelativePositionRange] =
    Bishop.moves ++ Rook.moves
  override val canJumpOver: Boolean = false
  override val captureSameAsMove: Boolean = true
  override val hasSpecialMoves: Boolean = false

}
