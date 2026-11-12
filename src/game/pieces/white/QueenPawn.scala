package game.pieces.white

import game.moves.SpecialMoveSpecification
import game.moves.pawns.{WhiteEnPassantLeft, WhiteEnPassantRight,
  WhitePawnInitialTwoForward, WhitePawnPromotion, WhitePawnPromotionCaptureLeft,
  WhitePawnPromotionCaptureRight}

/**
 * The pawn in front of the queen at the beginning of the game. Not to be
 * confused with [[game.pieces.PromotedQueen]], a pawn that is promoted to a
 * queen.
 */
object QueenPawn extends WhitePawn {
  override def specialMoves: Set[SpecialMoveSpecification] =
    Set(WhiteEnPassantLeft, WhiteEnPassantRight, WhitePawnInitialTwoForward,
      WhitePawnPromotion, WhitePawnPromotionCaptureLeft,
      WhitePawnPromotionCaptureRight)

}
