package game.moves.pawns

import game.pieces.{Bishop, PromotionFactory}

object PawnPromotion {

  var promotionFactory: PromotionFactory = Bishop

}

import game.moves.SpecialMoveSpecification

abstract class PawnPromotion extends SpecialMoveSpecification {

}
