package game.pieces.white

import game.{Player, White}

object Queen extends game.pieces.Queen with WhitePiece {
  override val affiliation: Player = White

}
