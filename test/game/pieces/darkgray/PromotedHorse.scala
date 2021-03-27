package game.pieces.darkgray

import game.pieces.{Horse, Pawn, Promoted}

class PromotedHorse(val pawn: Pawn) extends Horse with DarkGrayPiece
  with Promoted {

  override def prior: Pawn = pawn

}
