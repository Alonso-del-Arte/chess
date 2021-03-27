package game.pieces.black

import game.pieces.{Bishop, Pawn, Promoted}

class PromotedBishop(val pawn: Pawn) extends Bishop with BlackPiece
  with Promoted {

  override def prior: Pawn = pawn

}
