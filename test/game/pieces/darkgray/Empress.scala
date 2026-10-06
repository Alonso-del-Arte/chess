package game.pieces.darkgray

import game.{DarkGray, Player, RelativePosition, RelativePositionRange}
import game.pieces.{Bishop, Rook}

object Empress extends game.pieces.Empress with DarkGrayPiece {
  override val affiliation: Player = DarkGray
  override val possibleMoves: Set[RelativePositionRange] =
    Bishop.moves ++ Rook.moves
  override val canJumpOver: Boolean = false
  // TODO: Write a test for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write a test for this
  override val possibleCaptures: Set[RelativePositionRange] =
    Tower.possibleCaptures
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = false

}
