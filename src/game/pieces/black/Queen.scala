package game.pieces.black

import game.{Black, Player}

object Queen extends game.pieces.Queen with BlackPiece {
  override val affiliation: Player = Black

}
