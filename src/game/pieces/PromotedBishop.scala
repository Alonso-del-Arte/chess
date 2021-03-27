package game.pieces

abstract class PromotedBishop(val pawn: Pawn) extends Bishop with Promoted {

  override def prior: Pawn = pawn

}
