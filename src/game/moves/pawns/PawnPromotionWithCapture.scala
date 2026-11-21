package game.moves.pawns

abstract class PawnPromotionWithCapture extends PawnPromotion {

  override def isCapture: Boolean = true

}
