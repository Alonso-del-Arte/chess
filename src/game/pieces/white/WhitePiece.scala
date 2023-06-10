package game.pieces.white

import game.{Neutral, Player, White}
import game.pieces.Piece

trait WhitePiece extends Piece {
  override val affiliation: Player = Neutral

}
