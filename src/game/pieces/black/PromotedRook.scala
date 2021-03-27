package game.pieces.black

import game.pieces.{Pawn, Promoted, Rook}

class PromotedRook(val pawn: Pawn) extends Rook with BlackPiece with Promoted {

  override def prior: Pawn = pawn

}
