package game.pieces.lightgray

import game.{LightGray, Player, RelativePositionRange}
import game.pieces.{Bishop, Knight}

object Horse extends game.pieces.Horse with LightGrayPiece {
  override val affiliation: Player = LightGray
  override val possibleMoves: Set[RelativePositionRange] = Knight.moves
  // TODO: Write tests for this
  override val canJumpOver: Boolean = false
  // TODO: Write tests for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write tests for this
  override val possibleCaptures: Set[RelativePositionRange] = Bishop.moves
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true

}
