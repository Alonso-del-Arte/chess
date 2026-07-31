package game.pieces.black

import game.RelativePositionRange
import game.pieces.{Knight, Rook}

object KingSideKnight extends Knight with BlackPiece {
  override val captureSameAsMove: Boolean = true
  // TODO: Write tests for this
  override val possibleCaptures: Set[RelativePositionRange] = Rook.moves
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true

}
