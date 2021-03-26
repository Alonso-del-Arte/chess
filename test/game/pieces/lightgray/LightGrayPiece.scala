package game.pieces.lightgray

import game.{LightGray, Player}
import game.pieces.Piece

trait LightGrayPiece extends Piece {
  override val affiliation: Player = LightGray

}
