package game.moves.pawns

import game.pieces.{PromotionFactory, Queen}

object PawnPromotion {

  var promotionFactory: PromotionFactory = Queen

}

import game.moves.SpecialMoveSpecification

abstract class PawnPromotion extends SpecialMoveSpecification {

  /**
   * Tells that this special move does not involve a second piece of the same
   * side to already be on the board for its completion.
   *  @return False, since the promoted piece was not on the board prior to the
   *          completion of this move.
   */
  override def involvesPiecesOfSameSide: Boolean = false

}
