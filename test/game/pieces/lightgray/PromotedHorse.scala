package game.pieces.lightgray

import game.pieces.{Horse, Pawn, Promoted}

@deprecated("Use equivalent from enclosing package", "Chess 0.1")
class PromotedHorse(val pawn: Pawn) extends Horse with LightGrayPiece
  with Promoted {

  override def prior: Pawn = pawn

}
