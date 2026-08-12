package game.pieces.white

import game.{Player, RelativePosition, RelativePositionRange, White}

/**
 * The pawn in front of the queen at the beginning of the game. Not to be
 * confused with [[game.pieces.PromotedQueen]], a pawn that is promoted to a
 * queen.
 */
object QueenPawn extends WhitePawn {
  override val affiliation: Player = White
  override val possibleMoves: Set[RelativePositionRange] =
    Set(new RelativePositionRange(new RelativePosition(0, 1),
      new RelativePosition(0, 2)))
  override val canJumpOver: Boolean = false
  // TODO: Write a test for this
  override val captureSameAsMove: Boolean = true
  // TODO: Write a test for this
  override val possibleCaptures: Set[RelativePositionRange] =
    KingSideKnight.possibleCaptures
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = false

}
