package game.pieces

abstract class PromotedKnight(val pawn: Pawn) extends Bishop with Promoted {

  override def prior: Pawn = pawn

}
