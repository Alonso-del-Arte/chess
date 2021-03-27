package game.pieces.black

import game.pieces.{Pawn, Promoted, Queen}

class PromotedQueen(val pawn: Pawn) extends Queen with BlackPiece
  with Promoted {

  override def prior: Pawn = pawn

}
