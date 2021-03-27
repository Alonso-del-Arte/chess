package game.pieces.darkgray

import game.pieces.{Pawn, PointyHatGuy, Promoted}

class PromotedPointyHatGuy(val pawn: Pawn) extends PointyHatGuy
  with DarkGrayPiece with Promoted {

  override def prior: Pawn = pawn

}
