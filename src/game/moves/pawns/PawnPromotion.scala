package game.moves.pawns

import game.pieces.{PromotionFactory, Queen}

object PawnPromotion {

  var promotionFactory: PromotionFactory = Queen

}

import game.moves.SpecialMoveSpecification

abstract class PawnPromotion extends SpecialMoveSpecification {

  // TODO: Write tests for this
  override def involvesPiecesOfSameSide: Boolean = false

}
