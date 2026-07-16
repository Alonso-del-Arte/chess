package game.pieces.lightgray

import game.{LightGray, Player, RelativePositionRange}
import game.pieces.{Bishop, Pawn, PointyHatGuy, Promoted}

class PromotedPointyHatGuy(val pawn: Pawn) extends PointyHatGuy
  with LightGrayPiece with Promoted {
  override val canJumpOver: Boolean = false
  // TODO: Write tests for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write tests for this
  override def possibleCaptures: Set[RelativePositionRange] =
    Set(Bishop.moveNorthwest, Bishop.moveSoutheast)
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true

  override def prior: Pawn = pawn

}
