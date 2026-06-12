package game.pieces.black

import game.RelativePositionRange
import game.pieces.Rook

object QueenSideRook extends Rook with BlackPiece {
  override val possibleCaptures: Set[RelativePositionRange] = Rook.moves
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = true

}
