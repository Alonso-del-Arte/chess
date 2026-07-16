package game.pieces.lightgray

import game.pieces.{Pawn, Promoted, Tower}

@deprecated("Use equivalent from enclosing package", "Chess 0.1")
class PromotedTower(val pawn: Pawn) extends Tower with LightGrayPiece
  with Promoted {
  override val couldCastle: Boolean = false

  override def prior: Pawn = pawn

}
