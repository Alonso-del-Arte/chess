package game.pieces.white

import game.pieces.{Bishop, Pawn, Promoted}

class PromotedBishop(val pawn: Pawn) extends Bishop with WhitePiece
  with Promoted {

  override def prior: Pawn = pawn

}
