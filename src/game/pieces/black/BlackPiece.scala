package game.pieces.black

import game.{Black, Neutral, Player}
import game.pieces.Piece

trait BlackPiece extends Piece {
  override val affiliation: Player = Neutral

}
