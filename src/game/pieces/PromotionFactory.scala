package game.pieces

import game.pieces.{Pawn, Promoted}

trait PromotionFactory {

  def promote(pawn: Pawn): Promoted

}
