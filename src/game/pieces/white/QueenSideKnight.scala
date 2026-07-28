package game.pieces.white

import game.RelativePositionRange
import game.pieces.{Bishop, Knight, Rook}

object QueenSideKnight extends Knight with WhitePiece {
  override val canJumpOver: Boolean = true
  // TODO: Write tests for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write tests for this
  override val possibleCaptures: Set[RelativePositionRange] = Rook.moves
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true

}
