package game.pieces.lightgray

import game.{LightGray, Player, RelativePositionRange}
import game.pieces.Knight

object Horse extends game.pieces.Horse with LightGrayPiece {
  override val affiliation: Player = LightGray
  override val possibleMoves: Set[RelativePositionRange] = Knight.moves
  override val canJumpOver: Boolean = true
  override val captureSameAsMove: Boolean = true
  override val possibleCaptures: Set[RelativePositionRange] = Knight.moves
  override val hasSpecialMoves: Boolean = false

}
