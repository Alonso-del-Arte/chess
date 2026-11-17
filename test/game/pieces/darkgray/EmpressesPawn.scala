package game.pieces.darkgray

import game.moves.SpecialMoveSpecification
import game.moves.pawns.{BlackEnPassantLeft, BlackEnPassantRight,
  BlackPawnInitialTwoForward, BlackPawnPromotion, BlackPawnPromotionCaptureLeft,
  BlackPawnPromotionCaptureRight}

/**
 * The Dark Gray empress's pawn is equivalent to the Black queen's pawn.
 */
object EmpressesPawn extends DarkGrayPawn {
  override def specialMoves: Set[SpecialMoveSpecification] =
    Set(BlackEnPassantLeft, BlackEnPassantRight, BlackPawnInitialTwoForward,
      BlackPawnPromotion, BlackPawnPromotionCaptureLeft,
      BlackPawnPromotionCaptureRight)

}
