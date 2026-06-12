package game.pieces.black

import game.pieces.Rook

object QueenSideRook extends Rook with BlackPiece {
  override val couldCastle: Boolean = true

}
