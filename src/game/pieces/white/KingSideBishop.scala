package game.pieces.white

import game.{Neutral, Player, RelativePositionRange, White}
import game.pieces.Bishop

object KingSideBishop extends Bishop with WhitePiece {
  override val affiliation: Player = White
  // TODO: Write tests for this
  override val possibleMoves: Set[RelativePositionRange] = Set()
  // TODO: Write tests for this
  override val canJumpOver: Boolean = true
  // TODO: Write tests for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true
  // TODO: Write tests for this
  override def possibleCaptures: Set[RelativePositionRange] =
    Set(Bishop.moveNorthwest)

}
