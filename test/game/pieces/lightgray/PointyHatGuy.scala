package game.pieces.lightgray

import game.{LightGray, Player, RelativePositionRange}
import game.pieces.Bishop

object PointyHatGuy extends game.pieces.PointyHatGuy with LightGrayPiece {
  override val affiliation: Player = LightGray
  // TODO: Write tests for this
  override val possibleMoves: Set[RelativePositionRange] = Set()
  // TODO: Write tests for this
  override val canJumpOver: Boolean = true
  // TODO: Write tests for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true
  // TODO: Write tests for this
  override def possibleCaptures: Set[RelativePositionRange] =
    Set(Bishop.moveNorthwest)

}
