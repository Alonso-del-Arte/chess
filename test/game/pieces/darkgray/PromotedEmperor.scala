package game.pieces.darkgray

import game.pieces.{Emperor, Pawn, Promoted}

class PromotedEmperor(val pawn: Pawn) extends Emperor with DarkGrayPiece
  with Promoted {

  override def prior: Pawn = pawn

}
