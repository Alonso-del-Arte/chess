package game.pieces.black

import game.{Black, Neutral, Player}
import game.pieces.Rook

object KingSideRook extends Rook with BlackPiece {
  override val affiliation: Player = Neutral

}
