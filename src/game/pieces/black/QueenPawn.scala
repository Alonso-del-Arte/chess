package game.pieces.black

import game.{Black, Player, RelativePosition, RelativePositionRange}

/**
 * The pawn in front of the queen at the beginning of the game. Not to be
 * confused with [[game.pieces.PromotedQueen]], a pawn that is promoted to a
 * queen.
 */
object QueenPawn extends BlackPawn with BlackPiece {
  override val affiliation: Player = Black
  // TODO: Write a test for this
  override val possibleMoves: Set[RelativePositionRange] =
    KingSideKnight.possibleMoves
  // TODO: Write a test for this
  override val canJumpOver: Boolean = true
  // TODO: Write a test for this
  override val captureSameAsMove: Boolean = true
  // TODO: Write a test for this
  override val possibleCaptures: Set[RelativePositionRange] =
    KingSideKnight.possibleCaptures
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = false

}
