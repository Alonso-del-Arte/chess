package game.pieces.darkgray

import game.{Neutral, Player, RelativePositionRange}
import game.pieces.Bishop

object PointyHatGuy extends game.pieces.PointyHatGuy with DarkGrayPiece {
  // TODO: Write tests for this
  override val affiliation: Player = Neutral
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
