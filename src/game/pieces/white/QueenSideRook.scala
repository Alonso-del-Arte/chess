package game.pieces.white

import game.pieces.Rook

object QueenSideRook extends Rook with WhitePiece {
  // TODO: Write a test for this
  override val hasSpecialMoves: Boolean = true
  // TODO: Write a test for this
  override val couldCastle: Boolean = false

}
