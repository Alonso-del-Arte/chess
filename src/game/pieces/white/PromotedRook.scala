package game.pieces.white

import game.pieces.{Pawn, Promoted, Rook}

class PromotedRook(val pawn: Pawn) extends Rook with WhitePiece with Promoted {

  override def prior: Pawn = pawn

}
