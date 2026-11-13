package game.pieces.black

import game.moves.SpecialMoveSpecification
import game.moves.pawns.{BlackEnPassantLeft, BlackEnPassantRight,
  BlackPawnInitialTwoForward, BlackPawnPromotion, BlackPawnPromotionCaptureLeft,
  BlackPawnPromotionCaptureRight}

object KingSideKnightPawn extends BlackPawn {
  override def specialMoves: Set[SpecialMoveSpecification] =
    Set(BlackEnPassantLeft, BlackEnPassantRight, BlackPawnInitialTwoForward,
      BlackPawnPromotion, BlackPawnPromotionCaptureLeft,
      BlackPawnPromotionCaptureRight)

}
