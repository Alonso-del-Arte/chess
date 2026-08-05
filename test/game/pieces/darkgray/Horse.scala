package game.pieces.darkgray

import game.{DarkGray, Player, RelativePositionRange}
import game.pieces.{Bishop, Knight}

object Horse extends game.pieces.Horse with DarkGrayPiece {
  override val affiliation: Player = DarkGray
  override val possibleMoves: Set[RelativePositionRange] = Knight.moves
  override val canJumpOver: Boolean = true
  override val captureSameAsMove: Boolean = true
  override val possibleCaptures: Set[RelativePositionRange] = Knight.moves
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true

}
