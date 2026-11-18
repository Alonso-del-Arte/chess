package game.pieces.lightgray

import game.moves.SpecialMoveSpecification
import game.moves.pawns.{WhiteEnPassantLeft, WhiteEnPassantRight,
  WhitePawnInitialTwoForward, WhitePawnPromotion, WhitePawnPromotionCaptureLeft,
  WhitePawnPromotionCaptureRight}

object EmperorsPawn extends LightGrayPawn {
  override def specialMoves: Set[SpecialMoveSpecification] =
    Set(WhiteEnPassantLeft, WhiteEnPassantRight, WhitePawnInitialTwoForward,
      WhitePawnPromotion, WhitePawnPromotionCaptureLeft,
      WhitePawnPromotionCaptureRight)

}
