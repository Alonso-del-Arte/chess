package game.pieces.lightgray

import game.pieces.{Pawn, Promoted, Tower}

class PromotedTower(val pawn: Pawn) extends Tower with LightGrayPiece
  with Promoted {

  override def prior: Pawn = pawn

}
