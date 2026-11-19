package game.moves.pawns

import game.moves.SpecialMoveSpecification

abstract class PawnPromotionWithCapture extends SpecialMoveSpecification {

  override def isCapture: Boolean = true

}
