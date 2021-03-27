package game.pieces.black

import game.pieces.{Knight, Pawn, Promoted}

class PromotedKnight(val pawn: Pawn) extends Knight with BlackPiece
  with Promoted {

  override def prior: Pawn = pawn

}
