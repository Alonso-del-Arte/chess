package game.pieces.white

import game.{Player, Neutral, White}
import game.pieces.Piece

trait WhitePiece extends Piece {
  override val affiliation: Player = Neutral

}
