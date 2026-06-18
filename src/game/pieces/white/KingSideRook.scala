package game.pieces.white

import game.RelativePositionRange
import game.pieces.Rook

object KingSideRook extends Rook with WhitePiece {
  override val couldCastle: Boolean = true

}
