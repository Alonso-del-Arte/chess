package game.pieces.lightgray

import game.pieces.{Emperor, Pawn, Promoted}

class PromotedEmperor(val pawn: Pawn) extends Emperor with LightGrayPiece
  with Promoted {

  override def prior: Pawn = pawn

}
