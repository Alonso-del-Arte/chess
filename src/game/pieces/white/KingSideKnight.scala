package game.pieces.white

import game.RelativePositionRange
import game.pieces.Knight

object KingSideKnight extends Knight with WhitePiece {
  override val possibleCaptures: Set[RelativePositionRange] = Knight.moves
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true

}
