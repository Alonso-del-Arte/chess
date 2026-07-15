package game.pieces.lightgray

import game.{Neutral, Player, RelativePositionRange}
import game.pieces.{Bishop, Pawn, PointyHatGuy, Promoted}

class PromotedPointyHatGuy(val pawn: Pawn) extends PointyHatGuy
  with LightGrayPiece with Promoted {
  // TODO: Write tests for this
  override val affiliation: Player = Neutral
  // TODO: Write tests for this
  override val possibleMoves: Set[RelativePositionRange] = Set()
  // TODO: Write tests for this
  override val canJumpOver: Boolean = true
  // TODO: Write tests for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write tests for this
  override def possibleCaptures: Set[RelativePositionRange] =
    Set(Bishop.moveNorthwest, Bishop.moveSoutheast)
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true

  override def prior: Pawn = pawn

}
