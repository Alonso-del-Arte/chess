package game.pieces.white

import game.RelativePositionRange
import game.pieces.Bishop

object KingSideBishop extends Bishop with WhitePiece {
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true
  // TODO: Write tests for this
  override def possibleCaptures: Set[RelativePositionRange] = Bishop.moves

}
