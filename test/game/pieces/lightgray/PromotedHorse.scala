package game.pieces.lightgray

import game.pieces.{Horse, Pawn, Promoted}

class PromotedHorse(val pawn: Pawn) extends Horse with LightGrayPiece
  with Promoted {

  override def prior: Pawn = pawn

}
