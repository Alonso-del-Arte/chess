package game.pieces.white

import game.RelativePositionRange
import game.pieces.{Knight, Rook}

object KingSideKnight extends Knight with WhitePiece {
  // TODO: Write tests for this
  override val possibleCaptures: Set[RelativePositionRange] = Rook.moves
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true

}
