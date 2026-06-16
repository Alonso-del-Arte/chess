package game.pieces.white

import game.{Player, RelativePositionRange, White}
import game.pieces.Rook

object QueenSideRook extends Rook with WhitePiece {
  override val canJumpOver: Boolean = false
  // TODO: Write a test for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write a test for this
  override val possibleCaptures: Set[RelativePositionRange] = Set()
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = true
  // TODO: Write a test for this
  override val couldCastle: Boolean = false

}
