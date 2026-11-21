package game.pieces

trait PromotionFactory {

  def promote(pawn: Pawn): Promoted

}
