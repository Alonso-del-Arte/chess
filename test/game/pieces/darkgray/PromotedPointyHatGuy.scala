package game.pieces.darkgray

import game.pieces.{NeutralPawn, Pawn, PointyHatGuy, Promoted}

class PromotedPointyHatGuy(val pawn: Pawn) extends PointyHatGuy
  with DarkGrayPiece with Promoted {

  override def prior: Pawn = NeutralPawn

}
