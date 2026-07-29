package game.pieces.white

import game.RelativePositionRange
import game.pieces.{Knight, Rook}

object QueenSideKnight extends Knight with WhitePiece {
  override val hasSpecialMoves: Boolean = false

}
