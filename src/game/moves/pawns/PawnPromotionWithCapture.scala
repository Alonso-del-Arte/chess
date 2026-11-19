package game.moves.pawns

import game.moves.SpecialMoveSpecification

abstract class PawnPromotionWithCapture extends SpecialMoveSpecification {

  // TODO: Write a test for this
  override def isCapture: Boolean = false

}
