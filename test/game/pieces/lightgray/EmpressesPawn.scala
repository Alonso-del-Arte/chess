package game.pieces.lightgray

import game.{LightGray, Player, RelativePosition, RelativePositionRange}

object EmpressesPawn extends LightGrayPawn with LightGrayPiece {
  override val affiliation: Player = LightGray
  // TODO: Write a test for this
  override val possibleMoves: Set[RelativePositionRange] = Emperor.possibleMoves
  // TODO: Write a test for this
  override val canJumpOver: Boolean = true
  // TODO: Write a test for this
  override val captureSameAsMove: Boolean = true
  // TODO: Write a test for this
  override val possibleCaptures: Set[RelativePositionRange] =
    Empress.possibleCaptures
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = false

}
