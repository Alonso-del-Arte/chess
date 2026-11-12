package game.pieces.white

import game.moves.SpecialMoveSpecification
import game.moves.pawns.{WhiteEnPassantLeft, WhiteEnPassantRight,
  WhitePawnInitialTwoForward, WhitePawnPromotion, WhitePawnPromotionCaptureLeft,
  WhitePawnPromotionCaptureRight}

/**
 * White's kingside knight's pawn starts out on g2. If this pawn doesn't move
 * and White castles, this pawn protects the king from attacks from the Black
 * queen or either of the Black rooks.
 */
object KingSideKnightPawn extends WhitePawn {
  override def specialMoves: Set[SpecialMoveSpecification] =
    Set(WhiteEnPassantLeft, WhiteEnPassantRight, WhitePawnInitialTwoForward,
      WhitePawnPromotion, WhitePawnPromotionCaptureLeft,
      WhitePawnPromotionCaptureRight)

}
