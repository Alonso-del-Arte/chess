package game.pieces

import game.RelativePositionRange

/**
 * The pointy hat guy is a chess piece to be used strictly for testing purposes
 * only. The pointy hat guy has the same moves as the bishop.
 * @author Alonso del Arte
 */
abstract class PointyHatGuy extends Piece {
  override val possibleMoves: Set[RelativePositionRange] = Set()
  override val canJumpOver: Boolean = true
  override val captureSameAsMove: Boolean = false

}
