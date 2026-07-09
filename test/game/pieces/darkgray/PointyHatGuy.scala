package game.pieces.darkgray

import game.RelativePositionRange
import game.pieces.Bishop

object PointyHatGuy extends game.pieces.PointyHatGuy with DarkGrayPiece {
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true
  override def possibleCaptures: Set[RelativePositionRange] = Bishop.moves

}
