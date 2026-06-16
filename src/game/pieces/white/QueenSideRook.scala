package game.pieces.white

import game.pieces.Rook

object QueenSideRook extends Rook with WhitePiece {
  override val hasSpecialMoves: Boolean = false
  // TODO: Write a test for this
  override val couldCastle: Boolean = false

}
