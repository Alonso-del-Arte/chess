package game.pieces.black

import game.{Black, Player}
import game.pieces.Bishop

object KingSideBishop extends Bishop with BlackPiece {
  override val affiliation: Player = Black

}
