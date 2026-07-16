package game.pieces.lightgray

import game.pieces.{Empress, Pawn, Promoted}

@deprecated("Use equivalent from enclosing package", "Chess 0.1")
class PromotedEmpress(val pawn: Pawn) extends Empress with LightGrayPiece
  with Promoted {

  override def prior: Pawn = pawn

}
