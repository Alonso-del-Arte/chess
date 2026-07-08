package game.pieces

import game.RelativePositionRange

/**
 * The pointy hat guy is a chess piece to be used strictly for testing purposes
 * only. The pointy hat guy has the same moves as the bishop.
 * @author Alonso del Arte
 */
abstract class PointyHatGuy extends Bishop {
  // TODO: Write tests for this
  override val hasSpecialMoves: Boolean = true
  override def possibleCaptures: Set[RelativePositionRange] = Bishop.moves

}
