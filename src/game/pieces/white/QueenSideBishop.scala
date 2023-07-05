package game.pieces.white

import game.{Player, White}
import game.pieces.Bishop

object QueenSideBishop extends Bishop with WhitePiece {
  override val affiliation: Player = White

}
