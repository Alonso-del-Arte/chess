package game.pieces.darkgray

import game.{DarkGray, Player, RelativePosition, RelativePositionRange}
import game.pieces.{Bishop, Rook}

object Empress extends game.pieces.Empress with DarkGrayPiece {
  override val affiliation: Player = DarkGray
  override val possibleMoves: Set[RelativePositionRange] =
    Bishop.moves ++ Rook.moves
  override val canJumpOver: Boolean = false
  override val captureSameAsMove: Boolean = true
  override val possibleCaptures: Set[RelativePositionRange] =
    Bishop.moves ++ Rook.moves
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = false

}
