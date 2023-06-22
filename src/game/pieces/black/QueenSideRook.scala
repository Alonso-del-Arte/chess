package game.pieces.black

import game.{Black, Player}
import game.pieces.Rook

object QueenSideRook extends Rook with BlackPiece {
  override val affiliation: Player = Black

}
