package game.pieces.white

import game.{Player, White}
import game.pieces.Rook

object KingSideRook extends Rook with WhitePiece {
  override val affiliation: Player = White

}
