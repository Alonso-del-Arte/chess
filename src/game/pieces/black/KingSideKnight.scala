package game.pieces.black

import game.RelativePositionRange
import game.pieces.{Knight, Rook}

object KingSideKnight extends Knight with BlackPiece {
  // TODO: Write tests for this
  override val canJumpOver: Boolean = false
  // TODO: Write tests for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write tests for this
  override val possibleCaptures: Set[RelativePositionRange] = Rook.moves
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true

}
