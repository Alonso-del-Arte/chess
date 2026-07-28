package game.pieces.white

import game.RelativePositionRange
import game.pieces.{Knight, Rook}

object QueenSideKnight extends Knight with WhitePiece {
  override val captureSameAsMove: Boolean = true
  // TODO: Write tests for this
  override val possibleCaptures: Set[RelativePositionRange] = Rook.moves
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true

}
