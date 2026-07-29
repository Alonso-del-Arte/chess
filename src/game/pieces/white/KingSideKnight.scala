package game.pieces.white

import game.RelativePositionRange
import game.pieces.{Bishop, Knight, Rook}

object KingSideKnight extends Knight with WhitePiece {
  override val possibleMoves: Set[RelativePositionRange] = Knight.moves
  // TODO: Write tests for this
  override val canJumpOver: Boolean = false
  // TODO: Write tests for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write tests for this
  override val possibleCaptures: Set[RelativePositionRange] = Rook.moves
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true

}
