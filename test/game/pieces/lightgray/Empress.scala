package game.pieces.lightgray

import game.{LightGray, Player, RelativePosition, RelativePositionRange}
import game.moves.SpecialMoveSpecification

object Empress extends game.pieces.Empress with LightGrayPiece {
  override val affiliation: Player = LightGray
  // TODO: Write a test for this
  override val possibleMoves: Set[RelativePositionRange] = Horse.possibleMoves
  // TODO: Write a test for this
  override val canJumpOver: Boolean = true
  // TODO: Write a test for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write a test for this
  override val possibleCaptures: Set[RelativePositionRange] =
    Tower.possibleCaptures
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = true

}
