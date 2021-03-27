package game.pieces

abstract class PromotedRook(val pawn: Pawn) extends Rook with Promoted {

  override def prior: Pawn = pawn

}
