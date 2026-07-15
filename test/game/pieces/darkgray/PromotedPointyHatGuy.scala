package game.pieces.darkgray

import game.RelativePositionRange
import game.pieces.{Bishop, Pawn, PointyHatGuy, Promoted}

class PromotedPointyHatGuy(val pawn: Pawn) extends PointyHatGuy
  with DarkGrayPiece with Promoted {
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true
  override def possibleCaptures: Set[RelativePositionRange] = Bishop.moves

  override def prior: Pawn = pawn

}
