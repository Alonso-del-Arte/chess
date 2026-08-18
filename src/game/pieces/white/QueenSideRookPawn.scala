package game.pieces.white

import game.{Player, RelativePosition, RelativePositionRange, White}

object QueenSideRookPawn extends WhitePawn {
  override val affiliation: Player = White
  override val possibleMoves: Set[RelativePositionRange] =
    Set(new RelativePositionRange(new RelativePosition(0, 1),
      new RelativePosition(0, 2)))
  override val canJumpOver: Boolean = false
  override val captureSameAsMove: Boolean = false
  // TODO: Write a test for this
  override val possibleCaptures: Set[RelativePositionRange] =
    KingSideKnight.possibleCaptures
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = false

}
