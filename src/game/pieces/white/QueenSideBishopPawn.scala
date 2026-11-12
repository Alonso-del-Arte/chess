package game.pieces.white

import game.moves.SpecialMoveSpecification
import game.moves.pawns.{WhiteEnPassantLeft, WhiteEnPassantRight,
  WhitePawnInitialTwoForward, WhitePawnPromotion, WhitePawnPromotionCaptureLeft,
  WhitePawnPromotionCaptureRight}

object QueenSideBishopPawn extends WhitePawn {
  override def specialMoves: Set[SpecialMoveSpecification] =
    Set(WhiteEnPassantLeft, WhiteEnPassantRight, WhitePawnInitialTwoForward,
      WhitePawnPromotion, WhitePawnPromotionCaptureLeft,
      WhitePawnPromotionCaptureRight)

}
