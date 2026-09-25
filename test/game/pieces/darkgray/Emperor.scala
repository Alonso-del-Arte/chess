package game.pieces.darkgray

import game.{DarkGray, Player, RelativePosition, RelativePositionRange}
import game.moves.{Castling, SpecialMoveSpecification}

object Emperor extends game.pieces.Emperor with DarkGrayPiece {
  override val affiliation: Player = DarkGray
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
  override def specialMoves: Set[SpecialMoveSpecification] = Set(Castling)

}
