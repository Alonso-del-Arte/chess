package game.pieces.white

import game.moves.SpecialMoveSpecification
import game.moves.pawns.{WhiteEnPassant, WhitePawnInitialTwoForward,
  WhitePawnPromotion, WhitePawnPromotionCaptureLeft,
  WhitePawnPromotionCaptureRight}

object KingPawn extends WhitePawn {
  override def specialMoves: Set[SpecialMoveSpecification] = Set(WhiteEnPassant,
    WhitePawnInitialTwoForward, WhitePawnPromotion,
    WhitePawnPromotionCaptureLeft, WhitePawnPromotionCaptureRight)

}
