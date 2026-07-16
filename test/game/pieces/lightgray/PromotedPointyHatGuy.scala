package game.pieces.lightgray

import game.pieces.{NeutralPawn, Pawn, PointyHatGuy, Promoted}

@deprecated("Use equivalent from enclosing package", "Chess 0.1")
class PromotedPointyHatGuy(val pawn: Pawn) extends PointyHatGuy
  with LightGrayPiece with Promoted {

  override def prior: Pawn = this.pawn

}
