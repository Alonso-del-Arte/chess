package game.pieces

import game.RelativePositionRange

abstract class Queen extends Piece {
  override val possibleMoves: Set[RelativePositionRange] =
    Bishop.moves ++ Rook.moves
  override val captureSameAsMove: Boolean = true

}
