package game.pieces.darkgray

import game.pieces.{Pawn, Promoted, Tower}

class PromotedTower(val pawn: Pawn) extends Tower with DarkGrayPiece
  with Promoted {
  // TODO: Write a test for this
  override val couldCastle: Boolean = true
  override def prior: Pawn = pawn

}
