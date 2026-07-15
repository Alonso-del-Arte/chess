package game.pieces.darkgray

import game.pieces.{Pawn, PointyHatGuy, Promoted}

class PromotedPointyHatGuy(val pawn: Pawn) extends PointyHatGuy
  with DarkGrayPiece with Promoted {
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true

  override def prior: Pawn = pawn

}
