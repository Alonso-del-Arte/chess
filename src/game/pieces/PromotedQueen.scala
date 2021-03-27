package game.pieces

abstract class PromotedQueen(val pawn: Pawn) extends Queen with Promoted {

  override def prior: Pawn = pawn

}
