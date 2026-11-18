package game.pieces.lightgray

import game.{RelativePosition, RelativePositionRange}
import game.moves.SpecialMoveSpecification
import game.moves.pawns.{WhiteEnPassantLeft, WhiteEnPassantRight,
  WhitePawnInitialTwoForward, WhitePawnPromotion, WhitePawnPromotionCaptureLeft,
  WhitePawnPromotionCaptureRight}
import game.pieces.Pawn

abstract class LightGrayPawn extends Pawn with LightGrayPiece {
  override val possibleMoves: Set[RelativePositionRange] =
    Set(new RelativePositionRange(new RelativePosition(0, 1),
      new RelativePosition(0, 1)))
  override val possibleCaptures: Set[RelativePositionRange] =
    Set(RelativePositionRange(new RelativePosition(-1, 1)),
      RelativePositionRange(new RelativePosition(1, 1)))
  override def specialMoves: Set[SpecialMoveSpecification] =
    Set(WhiteEnPassantLeft, WhiteEnPassantRight, WhitePawnInitialTwoForward,
      WhitePawnPromotion, WhitePawnPromotionCaptureLeft,
      WhitePawnPromotionCaptureRight)

}
