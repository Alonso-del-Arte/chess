package game.pieces.darkgray

import game.{DarkGray, Player}
import game.pieces.Piece

trait DarkGrayPiece extends Piece {
  override val affiliation: Player = DarkGray

}
