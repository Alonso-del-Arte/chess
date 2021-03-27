package game.pieces.darkgray

import game.pieces.{Empress, Pawn, Promoted}

class PromotedEmpress(val pawn: Pawn) extends Empress with DarkGrayPiece
  with Promoted {

  override def prior: Pawn = pawn

}
