package game.moves.pawns

abstract class PawnPromotionWithCapture extends PawnPromotion {

  override def isCapture: Boolean = true

  // TODO: Write tests for this
  override def involvesPiecesOfSameSide: Boolean = false

}
