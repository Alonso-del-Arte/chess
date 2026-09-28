package game.pieces.lightgray

import game.{LightGray, Player, RelativePosition, RelativePositionRange,
  ShortMoveRanges}
import game.moves.{Castling, SpecialMoveSpecification}

object Emperor extends game.pieces.Emperor with LightGrayPiece {
  override val affiliation: Player = LightGray
  // TODO: Write a test for this
  override val possibleMoves: Set[RelativePositionRange] = Tower.possibleMoves
  // TODO: Write a test for this
  override val canJumpOver: Boolean = true
  // TODO: Write a test for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write a test for this
  override val possibleCaptures: Set[RelativePositionRange] =
    Horse.possibleCaptures
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = false

}
