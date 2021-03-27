package game.pieces.white

import game.pieces.{Knight, Pawn, Promoted}

class PromotedKnight(val pawn: Pawn) extends Knight with WhitePiece
  with Promoted {

  override def prior: Pawn = pawn

}
