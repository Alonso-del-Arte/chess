package game.pieces.darkgray

import game.{DarkGray, Player, RelativePositionRange}

object Tower extends game.pieces.Tower with DarkGrayPiece {
  override val affiliation: Player = DarkGray
  // TODO: Write a test for this
  override val possibleMoves: Set[RelativePositionRange] = Set()
  // TODO: Write a test for this
  override val canJumpOver: Boolean = true
  // TODO: Write a test for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write a test for this
  override val possibleCaptures: Set[RelativePositionRange] = Set()
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = true
  // TODO: Write a test for this
  override val couldCastle: Boolean = false

}
