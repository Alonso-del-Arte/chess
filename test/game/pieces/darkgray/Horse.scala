package game.pieces.darkgray

import game.{Neutral, Player, RelativePositionRange}
import game.pieces.{Bishop, Rook}

object Horse extends game.pieces.Horse with DarkGrayPiece {
  // TODO: Write a test for this
  override val affiliation: Player = Neutral
  // TODO: Write tests for this
  override val possibleMoves: Set[RelativePositionRange] = Bishop.moves
  // TODO: Write tests for this
  override val canJumpOver: Boolean = false
  // TODO: Write tests for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write tests for this
  override val possibleCaptures: Set[RelativePositionRange] = Rook.moves
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true

}
