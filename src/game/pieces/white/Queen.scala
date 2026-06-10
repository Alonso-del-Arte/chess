package game.pieces.white

import game.pieces.{Bishop, Rook}
import game.{Player, RelativePositionRange, White}

object Queen extends game.pieces.Queen with WhitePiece {
  override def possibleCaptures: Set[RelativePositionRange] =
    Bishop.moves ++ Rook.moves
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true

}
