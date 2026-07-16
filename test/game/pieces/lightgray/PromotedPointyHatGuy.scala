package game.pieces.lightgray

import game.pieces.{NeutralPawn, Pawn, PointyHatGuy, Promoted}

class PromotedPointyHatGuy(val pawn: Pawn) extends PointyHatGuy
  with LightGrayPiece with Promoted {

  override def prior: Pawn = this.pawn

}
