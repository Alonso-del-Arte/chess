package game.pieces

import game.RelativePositionRange

/**
 * The horse is a chess piece to be used strictly for testing purposes only. The
 * horse has the same moves as the knight.
 * @author Alonso del Arte
 */
abstract class Horse extends Piece {
  override val possibleMoves: Set[RelativePositionRange] = Set()
  override val canJumpOver: Boolean = true

}
