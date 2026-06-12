package game.pieces.black

import game.pieces.Rook

object KingSideRook extends Rook with BlackPiece {
  // TODO: Write a test for this
  override val couldCastle: Boolean = false

}
