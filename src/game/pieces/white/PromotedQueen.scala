package game.pieces.white

import game.pieces.{Pawn, Promoted, Queen}

class PromotedQueen(val pawn: Pawn) extends Queen with WhitePiece
  with Promoted {

  override def prior: Pawn = pawn

}
