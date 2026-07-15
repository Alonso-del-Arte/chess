package game.pieces.darkgray

import game.RelativePositionRange
import game.pieces.{Bishop, Pawn, PointyHatGuy, Promoted}

class PromotedPointyHatGuy(val pawn: Pawn) extends PointyHatGuy
  with DarkGrayPiece with Promoted {
  override val captureSameAsMove: Boolean = true
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true
  // TODO: Write tests for this
  override def possibleCaptures: Set[RelativePositionRange] =
    Set(Bishop.moveNorthwest)

  override def prior: Pawn = pawn

}
