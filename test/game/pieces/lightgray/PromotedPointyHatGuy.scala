package game.pieces.lightgray

import game.pieces.{Pawn, PointyHatGuy, Promoted}

class PromotedPointyHatGuy(val pawn: Pawn) extends PointyHatGuy
  with LightGrayPiece with Promoted {
  override val hasSpecialMoves: Boolean = false

  override def prior: Pawn = pawn

}
