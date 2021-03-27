package game.pieces.darkgray

import game.pieces.{Pawn, Promoted, Tower}

class PromotedTower(val pawn: Pawn) extends Tower with DarkGrayPiece
  with Promoted {

  override def prior: Pawn = pawn

}
