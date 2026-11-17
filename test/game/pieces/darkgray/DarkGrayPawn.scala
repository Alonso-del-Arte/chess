package game.pieces.darkgray

import game.{RelativePosition, RelativePositionRange}
import game.moves.SpecialMoveSpecification
import game.moves.pawns.{BlackEnPassantLeft, BlackEnPassantRight,
  BlackPawnInitialTwoForward, BlackPawnPromotion, BlackPawnPromotionCaptureLeft,
  BlackPawnPromotionCaptureRight}
import game.pieces.Pawn

abstract class DarkGrayPawn extends Pawn with DarkGrayPiece {
  override val possibleMoves: Set[RelativePositionRange] =
    Set(new RelativePositionRange(new RelativePosition(0, -1),
      new RelativePosition(0, -1)))
  override val possibleCaptures: Set[RelativePositionRange] =
    Set(RelativePositionRange(new RelativePosition(-1, -1)),
      RelativePositionRange(new RelativePosition(1, -1)))
  override def specialMoves: Set[SpecialMoveSpecification] =
    Set(BlackEnPassantLeft, BlackEnPassantRight, BlackPawnInitialTwoForward,
      BlackPawnPromotion, BlackPawnPromotionCaptureLeft,
      BlackPawnPromotionCaptureRight)

}
