package game.pieces

import game.RelativePositionRange

/**
 * The pointy hat guy is a chess piece to be used strictly for testing purposes
 * only. The pointy hat guy has the same moves as the bishop.
 * @author Alonso del Arte
 */
abstract class PointyHatGuy extends Bishop {
  override val canJumpOver: Boolean = false
  // TODO: Write tests for this
  override val captureSameAsMove: Boolean = false
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true
  // TODO: Write tests for this
  override def possibleCaptures: Set[RelativePositionRange] =
    Set(Bishop.moveNorthwest)

}
