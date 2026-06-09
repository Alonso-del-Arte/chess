package game.pieces.white

import game.pieces.{Bishop, Rook}
import game.{Player, RelativePositionRange, White}

object Queen extends game.pieces.Queen with WhitePiece {
  // TODO: Write tests for this
  override val possibleMoves: Set[RelativePositionRange] = Rook.moves
  // TODO: Write tests for this
  override val canJumpOver: Boolean = true
  // TODO: Write tests for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write tests for this
  override def possibleCaptures: Set[RelativePositionRange] = Bishop.moves
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true

}
