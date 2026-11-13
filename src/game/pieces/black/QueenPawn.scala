package game.pieces.black

import game.moves.SpecialMoveSpecification
import game.moves.pawns.{BlackEnPassantLeft, BlackEnPassantRight,
  BlackPawnInitialTwoForward, BlackPawnPromotion, BlackPawnPromotionCaptureLeft,
  BlackPawnPromotionCaptureRight}

/**
 * The pawn in front of the queen at the beginning of the game. Not to be
 * confused with [[game.pieces.PromotedQueen]], a pawn that is promoted to a
 * queen.
 */
object QueenPawn extends BlackPawn {
  override def specialMoves: Set[SpecialMoveSpecification] =
    Set(BlackEnPassantLeft, BlackEnPassantRight, BlackPawnInitialTwoForward,
      BlackPawnPromotion, BlackPawnPromotionCaptureLeft,
      BlackPawnPromotionCaptureRight)

}
