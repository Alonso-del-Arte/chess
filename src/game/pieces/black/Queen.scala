package game.pieces.black

import game.pieces.{Bishop, Rook}
import game.{Black, Player, RelativePositionRange}

object Queen extends game.pieces.Queen with BlackPiece {
  override def possibleCaptures: Set[RelativePositionRange] =
    Bishop.moves ++ Rook.moves
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true

}
