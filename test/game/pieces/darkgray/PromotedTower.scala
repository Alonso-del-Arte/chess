package game.pieces.darkgray

import game.pieces.{Pawn, Promoted, Tower}

class PromotedTower(val pawn: Pawn) extends Tower with DarkGrayPiece
  with Promoted {
  override val couldCastle: Boolean = false
  override def prior: Pawn = pawn

}
