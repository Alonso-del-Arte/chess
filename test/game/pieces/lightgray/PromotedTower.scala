package game.pieces.lightgray

import game.pieces.{Pawn, Promoted, Tower}

class PromotedTower(val pawn: Pawn) extends Tower with LightGrayPiece
  with Promoted {
  // TODO: Write a test for this
  override val couldCastle: Boolean = true
  override def prior: Pawn = pawn

}
