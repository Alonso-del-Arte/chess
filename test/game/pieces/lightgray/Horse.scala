package game.pieces.lightgray

import game.RelativePositionRange
import game.pieces.Knight

object Horse extends game.pieces.Horse with LightGrayPiece {
  override val canJumpOver: Boolean = true
  override val captureSameAsMove: Boolean = true
  override val possibleCaptures: Set[RelativePositionRange] = Knight.moves
  override val hasSpecialMoves: Boolean = false

}
