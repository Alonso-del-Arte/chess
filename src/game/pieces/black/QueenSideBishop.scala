package game.pieces.black

import game.{Black, Player}
import game.pieces.Bishop

object QueenSideBishop extends Bishop with BlackPiece {
  override val affiliation: Player = Black

}
