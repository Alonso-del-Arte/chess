package game.pieces.darkgray

import game.pieces.{Emperor, Pawn, Promoted}

@deprecated("Use equivalent from enclosing package", "Chess 0.1")
class PromotedEmperor(val pawn: Pawn) extends Emperor with DarkGrayPiece
  with Promoted {

  override def prior: Pawn = pawn

}
