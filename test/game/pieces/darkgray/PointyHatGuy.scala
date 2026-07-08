package game.pieces.darkgray

import game.{DarkGray, Player, RelativePositionRange}
import game.pieces.Bishop

object PointyHatGuy extends game.pieces.PointyHatGuy with DarkGrayPiece {
  override val affiliation: Player = DarkGray
  // TODO: Write tests for this
  override val possibleMoves: Set[RelativePositionRange] =
    Set(Bishop.moveSoutheast)
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
