package game.pieces.black

import game.pieces.Rook

object KingSideRook extends Rook with BlackPiece {
  override val couldCastle: Boolean = true

}
