package game.pieces.white

import game.RelativePositionRange
import game.pieces.Rook

object KingSideRook extends Rook with WhitePiece {
  // TODO: Write a test for this
  override val couldCastle: Boolean = false

}
