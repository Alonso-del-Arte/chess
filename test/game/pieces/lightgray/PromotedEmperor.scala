package game.pieces.lightgray

import game.pieces.{Emperor, Pawn, Promoted}

@deprecated("Use equivalent from enclosing package", "Chess 0.1")
class PromotedEmperor(val pawn: Pawn) extends Emperor with LightGrayPiece
  with Promoted {

  override def prior: Pawn = pawn

}
