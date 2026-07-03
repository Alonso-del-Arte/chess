package game.pieces.white

import game.RelativePositionRange
import game.pieces.Bishop

object QueenSideBishop extends Bishop with WhitePiece {
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true
  override def possibleCaptures: Set[RelativePositionRange] = Bishop.moves

}
