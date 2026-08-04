package game.pieces.darkgray

import game.{DarkGray, Player, RelativePositionRange}
import game.pieces.{Bishop, Rook}

object Horse extends game.pieces.Horse with DarkGrayPiece {
  override val affiliation: Player = DarkGray
  // TODO: Write tests for this
  override val possibleMoves: Set[RelativePositionRange] = Rook.moves
  // TODO: Write tests for this
  override val canJumpOver: Boolean = false
  // TODO: Write tests for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write tests for this
  override val possibleCaptures: Set[RelativePositionRange] = Bishop.moves
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true

}
