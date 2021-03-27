package game.pieces.lightgray

import game.pieces.{Empress, Pawn, Promoted}

class PromotedEmpress(val pawn: Pawn) extends Empress with LightGrayPiece
  with Promoted {

  override def prior: Pawn = pawn

}
