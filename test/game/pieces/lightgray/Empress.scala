package game.pieces.lightgray

import game.{LightGray, Player, RelativePosition, RelativePositionRange}
import game.moves.SpecialMoveSpecification
import game.pieces.{Bishop, Rook}

object Empress extends game.pieces.Empress with LightGrayPiece {
  override val affiliation: Player = LightGray
  override val possibleMoves: Set[RelativePositionRange] =
    Bishop.moves ++ Rook.moves
  override val canJumpOver: Boolean = false
  override val captureSameAsMove: Boolean = true
  override val possibleCaptures: Set[RelativePositionRange] =
    Bishop.moves ++ Rook.moves
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = true

}
