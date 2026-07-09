package game.pieces.darkgray

import game.{DarkGray, Player, RelativePositionRange}
import game.pieces.Bishop

object PointyHatGuy extends game.pieces.PointyHatGuy with DarkGrayPiece {
  // TODO: Write tests for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true
  // TODO: Write tests for this
  override def possibleCaptures: Set[RelativePositionRange] =
    Set(Bishop.moveNorthwest)

}
