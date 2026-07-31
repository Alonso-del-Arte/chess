package game.pieces.black

import game.RelativePositionRange
import game.pieces.Knight

object KingSideKnight extends Knight with BlackPiece {
  override val possibleCaptures: Set[RelativePositionRange] = Knight.moves
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true

}
