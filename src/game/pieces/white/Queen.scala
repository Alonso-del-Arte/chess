package game.pieces.white

import game.pieces.{Bishop, Rook}
import game.{Player, RelativePositionRange, White}

object Queen extends game.pieces.Queen with WhitePiece {
  override val hasSpecialMoves: Boolean = false

}
