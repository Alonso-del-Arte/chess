package game.pieces.darkgray

import game.{DarkGray, Player, RelativePosition, RelativePositionRange}

object EmperorsPawn extends DarkGrayPawn with DarkGrayPiece {
  override val affiliation: Player = DarkGray
  // TODO: Write a test for this
  override val possibleMoves: Set[RelativePositionRange] = Set()
  // TODO: Write a test for this
  override val canJumpOver: Boolean = true
  // TODO: Write a test for this
  override val captureSameAsMove: Boolean = true
  // TODO: Write a test for this
  override val possibleCaptures: Set[RelativePositionRange] = Set()
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = false

}
